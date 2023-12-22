import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String lang = sc.next();

        if(lang.equals("a") || lang.equals("i") || lang.equals("u") || lang.equals("e") || lang.equals("o")){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}