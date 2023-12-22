import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(c.charAt(0)=='a'||c.charAt(0)=='i'||c.charAt(0)=='e'||c.charAt(0)=='o'||c.charAt(0)=='i'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }

    }
}
