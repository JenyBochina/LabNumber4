import java.util.ArrayDeque;
import java.util.Iterator;

public class MyDeQue <T> {
   ArrayDeque<T> states = new ArrayDeque<T>();
    void pushBack(T element){
        states.addLast(element);
    }
    void pushFront(T element){
        states.addFirst(element);
    }
    T popBack(){
      return states.pollLast();
    }
    T popFront(){
        return states.pollFirst();
    }
    T back(){
        return states.peekLast();
    }
    T front(){
        return states.peekFirst();
    }
    int size(){
       return states.size();
    }
    void clear(){
        states.clear();
    }
    Object[] toArray(){
        Object[] array = new Object[states.size()];
        int count = 0;
        for (Iterator<T> i = states.iterator(); i.hasNext();) {
            array[count++] = i.next();
        }
        return array;
    }
    @Override
    public String toString() {
        return states+"";
    }
}
