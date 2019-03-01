public class StringManipulator {

    public int getIndexOrNull(String str1, char letter){
        return str1.indexOf(letter);
    }

    public String trimAndConcat(String str2, String str3){
        return str2.trim() + str3.trim();
    }

    public int getIndexOrNull(String str4, String str5){
    return str4.indexOf(str5);
    }

    public String concatSubstring(String str6, int a2, int b2, String str7){
        return str6.substring(a2, b2) + str7;
    }



}