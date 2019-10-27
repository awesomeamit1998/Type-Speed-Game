import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Dictionary {

    public Dictionary() {

    }


    public static ArrayList<String> getWords(String file) throws FileNotFoundException {
        
        Scanner input =  new Scanner(new File(file));
       
        ArrayList<String> words = new ArrayList<String>();
        while(input.hasNext()) {
            words.add(input.next());
        }
        input.close();
        return words;
    }
}
