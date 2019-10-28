package Data_Structures;
import java.util.ArrayList;
import java.util.List;


public class List_continued {

    private static void Partial_Sums(List<Integer> array)
    { List<Integer>  newArray =new ArrayList<>();
        int sum=0;
        for ( Integer element: array ) {
            sum=element+sum;
            array.add(sum);
        }
        System.out.println(newArray);
    }

    public static void main(String[] args) {
//        List<Integer> newArray =new ArrayList<>(List.of(1,5,2,4));
//        List<Integer> list = new ArrayList<>(List.of(1, 5, 2, 4));
//        newArray.add(1);newArray.add(5);newArray.add(2);newArray.add(4);

//        Partial_Sums(newArray);
    }


    }


