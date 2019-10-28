package Data_Structures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashSetP46 {

   static List<Set<Integer>> partitionIntegers(List<Integer> myList, int n) {
        List<Set<Integer>> partitionedList= new ArrayList<Set<Integer>>();

       for (int i = 0; i < n; i++) {
           Set<Integer> seti=new HashSet<>();
           for (Integer element: myList) {
               if (element%n==i)
               {seti.add(element);}

               }
           partitionedList.add(seti);}
     return partitionedList;
    }

    public static void main(String[] args) {
        List<Integer> _list = new ArrayList<>();
        _list.add(2);
        _list.add(5);
        _list.add(3);
        _list.add(7);

        System.out.println(partitionIntegers(_list, 9));
        int a = 0%5;
        System.out.println(a);
    }
}
