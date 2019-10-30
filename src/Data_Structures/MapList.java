package Data_Structures;
//it maps keys to values / dictionary in c# both have to be objects. key used to retrieve the value.
//hashmap most common map in java
//keyset gets a set of keys
// hashMap builds an array of these mini-lists.
//array:group of same elements+ immutability=
// predefinded size+ access via index starts with 0+ can have many dimensions+ part of java language
//list:dynamic size+ elements can be added and removed+ get method to access using index+ has to be imported:java.util.List
//set:same elements type+ not ordered + non redundant+ dynamic size+ elements can be added and removed+class in Java library.
//map:group of elements of same type+key value pair+key and value may be of same type+ access to element via key(key has to be
//unique+values dont have to be unique+ combinations of set of keys und list of value+




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
          System.out.println(partitionIntegers(_list, 20));
         }
      }
