import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String  S = sc.next();

    char[] s = S.toCharArray();

    if(s[0]==s[1] || s[1]==s[2] || s[2]==s[3]){
		System.out.println("Bad");
    }else{
        System.out.println("Good");
    }
	}
}