import java.util.Arrays; 
import java.util.Scanner; 
public class Main { public static void main(String[] args) { 
Scanner keyboard = new Scanner(System.in); 

int A = keyboard.nextInt(); 
int B = keyboard.nextInt(); 
int C = keyboard.nextInt(); 
int D = keyboard.nextInt(); 

String ans = "";

if(A+B > C+D){
ans = "Left";
} else if(A+B == C+D){
ans = "Balanced";
} else{
ans = "Right";
}
		System.out.println(ans);
		keyboard.close();
	 	}
 } 
