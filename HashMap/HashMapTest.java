import java.util.HashMap;//needed for using the HashMap(equivalent of dictionary of the key-value pair in Python)
import java.util.Set; //needed for using Set with the HashMap
public class HashMapTest{
    public static void main(String[] args){
        //declaration of the HashMap (key-value pair in String)
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        //create the HashMap of the TrackList
        trackList.put("title song one", "Tomorrow will come");
        trackList.put("title song two", "My heart will go on");
        trackList.put("title song three", "The power of love");
        trackList.put("title song four", "It's all coming back to me");

        //get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys){//the different key-value pair are not printed in perfect order
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
        System.out.println("#########################");
        System.out.println(trackList.get("title song three"));
    }
}