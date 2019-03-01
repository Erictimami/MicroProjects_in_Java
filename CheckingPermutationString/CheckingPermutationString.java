

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckingPermutationString{
	String str1;
    String str2;
	
	public CheckingPermutationString(String str1, String str2){
		this.str1 = str1;
		this.str2 = str2;
	}

    public boolean check(){
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        if(this.str1.length() != this.str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            if(map1.get(str1.charAt(i)) != null){
                map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
            }else{
                map1.put(str1.charAt(i), 1);
            }
        }
        for(int i=0; i<str2.length(); i++){
            if(map2.get(str2.charAt(i)) != null){
                map2.put(str2.charAt(i), map2.get(str2.charAt(i))+1);
            }else{
                map2.put(str2.charAt(i), 1);
            }
        }
        Set<Character> keys = map1.keySet();
        for(Character key: keys){
            if(map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
    }
}