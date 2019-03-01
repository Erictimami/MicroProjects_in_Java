public class BasicsTest{
    public static void main(String[] args){
        Basics basic1= new Basics();
        basic1.print(1, 255);
        basic1.printOdd(4, 200);
        basic1.printSum(0, 255);
        int[] myArray = {1,3,-5,20,9,13};
        basic1.printArray(myArray);
        basic1.printMax(myArray);
        basic1.printAvg(myArray);
        basic1.printOddArray(10, 30);
        basic1.printNumMax(myArray, 9);
        basic1.printSquareArray(myArray);
        basic1.printReplaceNeg(myArray);
        basic1.printMaxMinAvg(myArray);
        basic1.shiftArray(myArray);
    }
}