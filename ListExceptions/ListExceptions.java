import java.util.Random;
import java.util.ArrayList;

class OutOfGasException extends Exception{}
class ListExceptionsTry{
    public boolean listExceptionsTry(j`int i) throws OutOfGasException{
        Integer castedValue = (Integer) myList.get(i);
        boolean hasGas = r.nextBoolean();
        if(hasGas){
            return true;
        }
        throw new OutOfGasException();
    }
}


public class ListExceptions{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello world");
        myList.add(48);
        myList.add("Goodbye World");
    for(int i = 0; i<myList.size(); i++){
        try{
            
            System.out.println("Casting value is a success !");
        }
        catch (OutOfGasException e){
            System.out.println("Casting value has an Error !");
            System.out.println(e);
        }
    }

    }
}
// class OutOfGasException extends Exception{}
// class ListExceptionsTry{
//     public boolean deliverMessage() throws OutOfGasException{
//         Random r = new Random();
//         boolean hasGas = r.nextBoolean();
//         if(hasGas){
//             return true;
//         }
//         throw new OutOfGasException();
//     }
// }


// public class ListExceptions{
//     public static void main(String[] args){
//         ArrayList<Object> myList = new ArrayList<Object>();
//         myList.add("13");
//         myList.add("Hello world");
//         myList.add(48);
//         myList.add("Goodbye World");
//     for(int i = 0; i<myList.size(); i++){
//         try{
//             Integer castedValue = (Integer) myList.get(i);
//             System.out.println("Casting value is a success !");
//         }catch (OutOfGasException e){
//             System.out.println("Casting value has an Error !");
//             System.out.println(e);
//         }
//     }

//     }
// }