package Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> implements Iterable<T>{

    Map<T,Integer> count = new HashMap<>();

    public Histogram(T ... keys){
        for (T key : keys){
            count.put(key, count.getOrDefault(key,0)+1);
        }
    }

    public void increment(T key){
        count.put(key, count.getOrDefault(key,0)+1);
    }

    public int getCount(T key) {
        return count.get(key);
    }

    @Override
    public Iterator<T> iterator() {
        return count.keySet().iterator();
    }
}
