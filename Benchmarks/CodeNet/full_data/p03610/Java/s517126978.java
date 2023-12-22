//
public class StringTest {
public static void main(String[] args) {
        String str = "abcdefghijk";
        String newstr = getStr(str);
        System.out.println(newstr);
}

//
        static String getStr(String s) {
        String newStr = new String();

        //get length of string
        int temp = s.length();
        if(temp % 2 == 0) {
        for(int i = 1; i <= (temp - 1); i += 2) {

        //rebuild string
        newStr += s.charAt(i);
}
}
        else {
        for(int i = 1; i <= (temp - 2); i += 2) {

        //rebuild string
        newStr += s.charAt(i);
}
}

return newStr;
}
} 