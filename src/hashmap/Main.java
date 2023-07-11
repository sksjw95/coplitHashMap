package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
       hashMap.put('a', 1);
        hashMap.put('b', 2);
        hashMap.put('c', 3);
        hashMap.put('d', 4);

        Set<Character> keySet = hashMap.keySet();
        Iterator<Character> iterator = keySet.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            Character key = iterator.next();
            int value = hashMap.get(key);
            if (value % 2 == 0){
                sum = sum + value;
            }
            else {
                continue;
            }
        }
        System.out.println(sum);

    }
}