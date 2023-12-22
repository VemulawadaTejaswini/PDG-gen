
import java.util.Scanner;

public class Main {
    public static final String origin="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        if(string.equals("zyxwvutsrqponmlkjihgfedcba")){
            System.out.println(-1);
            return;
        }
        System.out.println(nextString(string));

    }
    public static String nextString(String string){
        int index=string.length();
        if(index==origin.length()){
            int zIndex=string.indexOf('z');
            return string.substring(0,zIndex-1)+origin.charAt(origin.indexOf(string.charAt(zIndex-1))+1);
        }else{
            char[] chars=origin.toCharArray();
            for(int i=0;i<chars.length;i++){
                char c=chars[i];
                if(string.indexOf(c)==-1){
                    return string+c;
                }
            }
        }
        return null;
    }
    public static boolean isTasai(String string){
        char[] chars=string.toCharArray();
        for(int i=0;i<string.length();i++){
            char c=chars[i];
            for(int j=0;j<i;j++){
                if(chars[j]==c){
                    return false;
                }
            }
        }
        return true;
    }
}
