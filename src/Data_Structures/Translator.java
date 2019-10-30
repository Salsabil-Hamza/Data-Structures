package Data_Structures;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    public void addTranslation(String word,String translation)
    {
       Map<String,String> dictionary = new HashMap<>();
       dictionary.put(word,translation);

    }


   public String translate(String word)
    {

        return "hi";
    }


    public static void main(String[] args) {

    }
}
