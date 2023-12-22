import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String O = sc.next();
        String E = sc.next();
        String S = "";

        for(int i=0; i<O.length(); i++){
            if(i!=O.length()-1){
                S += String.valueOf((char)O.charAt(i)) + String.valueOf((char)E.charAt(i));
            }
            else{
                if(O.length()==E.length()){
                    S += String.valueOf((char)O.charAt(i)) + String.valueOf((char)E.charAt(i));
                }
                else{
                    S += String.valueOf((char)O.charAt(i));
                }
            }
        }
        System.out.println(S);
    }
}