import java.util.ArrayList;
import java.util.Arrays;
public class Basics{
    public void print(int a, int b){
        System.out.println("Print all numbers in an intervalle of 2 numbers");
        for(int i = a; i < b+1; i++){
            System.out.println(i);
        }
    }
    public void printOdd(int a, int b){
        System.out.println("Print all odd numbers in an intervalle of 2 numbers");
        if( a%2 !=1 ){
            a++;
        }
        for(int i = a; i<b+1; i+=2){
            System.out.println(i);
        }
    }
    public void printSum(int a, int b){
        int sum=0;
        System.out.println("Print all sum of all numbers in an intervalle of 2 numbers");
        for(int i=a; i<b+1; i++){
            // sum+=i;
            System.out.println("New number: "+i+" Sum: "+ (sum+=i));
        }
    }
    public void printArray(int[] X){
        System.out.println("Print all elts of the array");
        for (int elt: X){
            System.out.println(elt);
        }
    }
    public void printMax(int[] X){
        System.out.println("Print the max value of the array");
        int max = X[0];
        for (int elt: X){
            if(max<elt){
                max=elt;
            }
        }
        System.out.println(max);
    }
    public void printAvg(int[] X2){
        System.out.println("Print average of the array");
        int sum=0;
        for (int elt: X2){
            sum +=elt;
        }
        System.out.println(sum/X2.length);
    }

    public void printOddArray(int a2, int b2){
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        if( a2%2 !=1 ){
            a2++;
        }
        for(int i = a2; i<b2+1; i+=2){
            myArray2.add(i);
        }
        System.out.println("Print all the array of odd integers of the intervalle ");
        System.out.println(myArray2);
    }
    public void printNumMax(int[] X3, int y){
        int count=0;
        for( int elt: X3){
            if(elt > y){
                count++;
            }
        }
        System.out.println("Print the number of the value greater than y");
        System.out.println(count);
    }
    public void printSquareArray(int[] X4){
        for(int i=0; i<X4.length; i++){
            X4[i]=X4[i]*X4[i];
            // System.out.println(X4[i]);
        }
        System.out.println("Print the square of all the elements of the array");
        System.out.println(Arrays.toString(X4));
    }

    public void printReplaceNeg(int[] X5){
        for(int i=0; i<X5.length; i++){
            if(X5[i]<0){
                X5[i]=0;
            }
        }
        System.out.println("Print the array where all the negative value were replaced by 0");
        System.out.println(Arrays.toString(X5));
    }

    public void printMaxMinAvg(int[] X6){
        //how to define a array
        int [] result;
        result = new int[3];
        int max = X6[0];
        int min = X6[0];
        int sum = 0;
        for(int elt: X6){
            if (elt>max){
                max=elt;
            }
            if (elt<min){
                min=elt;
            }
            sum+=elt;
        }
        result[0]=max;
        result[1]=min;
        result[2]=sum/X6.length;
        System.out.println("Print [Max, Min, Avg] of the array");
        System.out.println(Arrays.toString(result));
    }
    public void shiftArray(int[] X7){
        for(int i=0; i<X7.length-1; i++){
            X7[i]=X7[i+1];
        }
        X7[X7.length-1]=0;
        System.out.println("Print the shifted array with the last value 0");
        System.out.println(Arrays.toString(X7));
    }
    
}