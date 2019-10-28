package Data_Structures;

import java.util.HashMap;
import java.util.Map;

public class Translator {

      void addTranslation(String word,String translation)
    {
       Map<String,String> dictionary = new HashMap<>();
       dictionary.put(word,translation);
    }


    String translate(String word)
    {
        return "hi";
    }


    public static void main(String[] args) {

    }
}
