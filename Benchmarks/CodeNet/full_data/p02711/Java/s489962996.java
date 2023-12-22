import java.util.*;

public class Main {
public static void main(String[] args) {
		
Scanner keyboard = new Scanner(System.in); 
		
String S = keyboard.next();
String ans = "No";
		
for(int i = 0; i<3; i++){
    if(S.charAt(i) == '7' ){
    ans = "Yes";
    }
} 

	System.out.println(ans);
	keyboard.close();	

	}
}
