package Data_Structures;

import java.util.*;

public class Main {

    static void EnterNames()
    {
        String s;
       Scanner in= new Scanner(System.in);
       List<String> MyList=new ArrayList<>();
        do
        {
            System.out.println("Give a name");
            s = in. nextLine();
            if (s.equals(""))
            {break;}
            MyList.add(s);
        }
        while (! s.isEmpty());



for (int i=MyList.size()-1;i >=0 ; --i)
{
    String word;
    word = MyList.get(i);

System.out.println(word);}

    }
    public static void main(String[] args) {
EnterNames();


    }
}

