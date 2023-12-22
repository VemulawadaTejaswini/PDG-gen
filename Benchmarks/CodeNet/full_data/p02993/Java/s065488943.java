import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String  S = sc.next();
   // char[] s = S.toCharArray();
    //ArrayList<Character> aa = new ArrayList<>();

	if(S.charAt(0)==S.charAt(1)){
		System.out.println("Bad");
    }else if(S.charAt(1)==S.charAt(2)){
		System.out.println("Bad");
    }else if(S.charAt(2)==S.charAt(3)){
		System.out.println("Bad");
    }else{
		System.out.println("Good");
	}
	}
}