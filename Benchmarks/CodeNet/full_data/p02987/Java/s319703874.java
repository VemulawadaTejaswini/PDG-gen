import java.util.*;

class Main{
	
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	String S = sc.nextLine();

	if(S[0]==S[1]&& S[1]!=S[2]&& S[2]==S[3]){

	System.out.println("Yes");

   }
	
	else if(S[0]==S[2]&& S[2]!=S[1] &&S[1]==S[3]){
	
	System.out.println("Yes");

   }	

	else if(S[0]==S[3] && S[3]!=S[1] && S[1]==S[2]){

	System.out.println("Yes");

   }

	else{

	System.out.println("No");

   }
  }
 }