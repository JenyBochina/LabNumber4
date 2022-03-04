import java.math.BigInteger;

public class MyInt {
    BigInteger variable;

    MyInt (String variable){
        this.variable = new BigInteger(variable);
    }
    MyInt (Integer variable){
        this.variable = new BigInteger(String.valueOf(variable));
    }
    MyInt (byte[] variable){
        String variableInString="";
        if (variable[0]==1) variableInString  = "-";
        for (int i=1;i<variable.length;++i){
            variableInString+=variable[i];
        }
        this.variable = new BigInteger(variableInString);
    }
    MyInt  add(MyInt arument){
        return new MyInt(variable.add(arument.getVariable()).toString());
    }
    MyInt  subtract(MyInt arument){
        return new MyInt(variable.subtract(arument.getVariable()).toString());
    }
    MyInt  multiply(MyInt arument){
        return new MyInt(variable.multiply(arument.getVariable()).toString());
    }
    MyInt  divide(MyInt arument){
        return new MyInt(variable.divide(arument.getVariable()).toString());
    }
    MyInt  max(MyInt arument){
        return new MyInt(variable.max(arument.getVariable()).toString());
    }
    MyInt  min(MyInt arument){
        return new MyInt(variable.min(arument.getVariable()).toString());
    }
    MyInt  abs(){
        return new MyInt(variable.abs().toString());
    }
    int  compareTo(MyInt arument){
        return variable.compareTo(arument.getVariable());
    }
    MyInt  gcd(MyInt arument){
        return new MyInt(variable.gcd(arument.getVariable()).toString());
    }
    @Override
    public String toString (){
        return this.variable.toString();
    }
    long  longValue(){
        return variable.longValue();
    }
    BigInteger getVariable(){
        return variable;
    }


}
