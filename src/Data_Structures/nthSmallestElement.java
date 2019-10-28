package Data_Structures;


        import java.util.*;
public class nthSmallestElement {
    public static int nthSmallestElement(int[] myArray, int n) {
    int temp;
    int length=myArray.length;
                                                                         // Sort with for Loop
    for (int i = 0 ; i<length ; i++){

        for (int j = i+1 ; j<length ; j++) {

            if (myArray[i] > myArray[j]){
                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }
        }
    }
       // Arrays.sort(aray);                                                     // Sort with out for Loop
        return myArray[n];
    }
    public static void main(String[] args) {
     int array[] = { 44, 0, 66, 99, 77, 33, 22, 55, 12, 88, 13};
        Scanner input = new Scanner(System.in);                                    // With Scanner
        System.out.println("Please Enter n value ");
        while (true)
        {

            int n = input.nextInt();
            if (n <= array.length)
            {System.out.println("nth Smallest Element is : " + nthSmallestElement(array, n));}
            else
            {
                System.out.println(Integer.MAX_VALUE);
            }
        }
        //linkedHashset preserves the order.divide conquer algortithm for the sets
     // With out Scanner
//        Scanner input = new Scanner(System.in);                                    // With Scanner
//        System.out.println("Please Enter the Values of Array! ");
//        int ln = input.nextInt();
//        int[] aray = new int[ln];
//        System.out.println("Enter Elements : ");                                  //For Loop for Enter Elements
//        for (int i = 0; i < ln; i++) {
//            aray[i] = input.nextInt();
//        }


    }
}