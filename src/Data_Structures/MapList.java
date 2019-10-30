package Data_Structures;
//it maps keys to values / dictionary in c# both have to be objects. key used to retrieve the value.
//hashmap most common map in java
//keyset gets a set of keys
// hashMap builds an array of these mini-lists.

import java.util.*;
public class MapList {
    static Map<Integer, Set<Integer>> partitionIntegers(List<Integer> myList, int n) {

        Map<Integer, Set<Integer>> partitionedMap = new HashMap<>();
        //first method
        for (Integer element:myList) {

            int i=element%n;
            if (!partitionedMap.containsKey(i))
            {
                Set<Integer> set = new HashSet<>();
                partitionedMap.put(i,set);
            }

            Set<Integer> set= partitionedMap.get(i);
            set.add(element);
        }
// second method
//        int key=0;
//
//        while (key <n)
//        { Set<Integer> set = new HashSet<>();
//            for (Integer element: myList) {
//                if (element%n==key)
//
//                { set.add(element);
//                partitionedMap.put(key, set);}
//            }
//           key++;
//        }
      return partitionedMap;
    }
      public static void main (String[]args) {
          List<Integer> _list = new ArrayList<>();
          _list.add(2);
          _list.add(5);
          _list.add(3);
          _list.add(3);
          _list.add(7);
          System.out.println(partitionIntegers(_list, 3));
         }
      }
