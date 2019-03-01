import java.util.ArrayList;//need to use the arrayList and be able to add a new value to an ArrayList
import java.util.Collections;
import java.util.Random; // need to use the random function
import java.util.Arrays;//need to convert array to string to be able to print it (the array)
import java.util.*;//need to use the pop and push with the array;

public class Puzzling{
    public void PrintArray(ArrayList<Integer> X){//the argument is not an array but it's a list of Array ty
        System.out.println("Print sum of the array");
        int sum=0;
        for (int elt: X){
            sum +=elt;
        }
        System.out.println(sum);
    }
    public void PrintMaxArray(ArrayList<Integer> X, int y){
        System.out.println("Print the array of max value greater than y");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int elt: X){
            if(elt>y){
                arr.add(elt);
            }
        }
        System.out.println(arr);
    }
    public void PrintShuffleArray(String[] X2){
        System.out.println("Print the shuffled array of string names");
        Random rand = new Random();
        for(int i= X2.length-1; i>0; i--){
            int index = rand.nextInt(i+1);
            //swap
            String temp = X2[i];
            X2[i] = X2[index];
            X2[index] = temp;
        }
        System.out.println(Arrays.toString(X2));
    }
    public void PrintArray(String[] X2, int y){
        System.out.println("Print the array where the length is greater than y");
        Stack<String> arr2 = new Stack<String>();
        for(String elt: X2){
            if(elt.length()>5){ // We use the method .length() with the () for having the length of the string
                arr2.push(elt);
            }
        }
        System.out.println(arr2);
    }
    public String[] PrintAlphabet(char c1, char c2){
        System.out.println("Print all the alphabet");
        Stack<String> alphabet = new Stack<String>();
        String[] alpha;
        alpha = new String[26];
        int i=0;
        for (char c = c1; c <= c2; c++){
            alpha[i] = String.valueOf(c);
            i++;
        }
        System.out.println(Arrays.toString(alpha));
        return alpha;
    }

    public void PrintShuffleAlphabet(String[] X2){
        System.out.println("Print the shuffled array of alphabet");
        Random rand = new Random();
        for(int i= X2.length-1; i>0; i--){
            int index = rand.nextInt(i+1);
            //swap
            String temp = X2[i];
            X2[i] = X2[index];
            X2[index] = temp;
        }
        System.out.println(Arrays.toString(X2));
        if(X2[0] == String.valueOf('a')){
            System.out.println(X2[0]+" is a vowel");
        }else if(X2[0] == String.valueOf('e')){
            System.out.println(X2[0]+" is a vowel");
        }else if(X2[0] == String.valueOf('i')){
            System.out.println(X2[0]+" is a vowel");
        }else if(X2[0] == String.valueOf('o')){
            System.out.println(X2[0]+" is a vowel");
        }else if(X2[0] == String.valueOf('u')){
            System.out.println(X2[0]+" is a vowel");
        }else{
            System.out.println(X2[0]+" is a consonant");
        }  
    }

    public void PrintArrayRandom(int a, int b){
        System.out.println("Print the array of 10 random number for an intervalle");
        Random rand = new Random();
        int[] Array;
        Array = new int[10];
        for(int i=0; i<Array.length; i++){
            Array[i]=rand.nextInt(b-a+1) + a;
        }
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));
    }

    public void PrintRandomString(String[] X3, int a){
        System.out.println("Print the random of String with the number of character is int a");
        Random rand = new Random();
        String str ="";
        for(int i=0; i<a; i++){
            str += X3[rand.nextInt(X3.length)];
        }
        System.out.println(str);
    }

    public void PrintArrayRandomString(String[] X4, int a, int b){
        System.out.println("Print the array of int b random String of int a characters");
        Random rand = new Random();
        String[] ArrayStr;
        ArrayStr = new String[b];
        for (int j=0; j<b; j++){
            String str="";
            for(int i=0; i<a; i++){
                str += X4[rand.nextInt(X4.length)];
            }
            ArrayStr[j]=str;
        }
        System.out.println(Arrays.toString(ArrayStr));
    }
    
}