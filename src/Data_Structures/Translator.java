package Data_Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {

     void addTranslation(String word,String translation, Map<String,String> dictionary)
    {

       if (!dictionary.containsKey(word))

       {dictionary.put(word,translation); }

    }


   String translate(String word, Map<String,String> dictionary)
    {
        if (!dictionary.containsKey(word))
        {return "sorry the word does not exist";}
        else return "the meaning of the word "+word+" is "+ dictionary.get(word);
    }


    public static void main(String[] args) {

        Map<String,String> dictionary = new HashMap<>();
        Translator t= new Translator();
        boolean flag=true;

        while (flag){

        System.out.println("press 1 to include a word to the dictionary or press 2 to lookup the word in the dictionary:");
        Scanner input= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        Scanner input3= new Scanner(System.in);

        int action=input2.nextInt();
        if (action==1)
        {
            System.out.println("give a word ");
        String word=input.nextLine();
            System.out.println(" give its translation");
        String translation=input3.nextLine();
        t.addTranslation(word,translation,dictionary);}
        else if(action==2)
        {System.out.println("which word would like to look up?");
         String word=input.nextLine();
            System.out.println(t.translate(word,dictionary));
        }
        else {
            System.out.println("you pressed the wrong number, try again");
        }
            System.out.println("would like to leave (y/n)?");
        String reply=input.nextLine();
        if (reply=="y") {
            flag=false;
        }

        }








    }
}
