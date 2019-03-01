import java.util.ArrayList;
import java.util.Collections;
public class PuzzlingTest{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(17);
        numbers.add(10);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);
        Puzzling nber = new Puzzling();
        nber.PrintArray(numbers);
        nber.PrintMaxArray(numbers, 2);   

        // ArrayList<String> names = new ArrayList<String>();
        // names.add("Nancy");
        // names.add("Jinichi");
        // names.add("Fujibayashi");
        // names.add("Momochi");
        // names.add("Ishikawa");
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        nber.PrintShuffleArray(names);
        nber.PrintArray(names, 5);
        nber.PrintAlphabet('a', 'z');
        nber.PrintShuffleAlphabet(nber.PrintAlphabet('a', 'z'));
        nber.PrintArrayRandom(55, 100);
        nber.PrintRandomString(nber.PrintAlphabet('a', 'z'), 5);
        nber.PrintArrayRandomString(nber.PrintAlphabet('a', 'z'), 5, 10);
    }
}
