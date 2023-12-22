import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	String S = sc.next();

	int preans = 0;

	for(int i=0; i<N-1; i++){

	if(S.charAt(i)==S.charAt(i+1)){

	preans ++;

   }	

  }

	System.out.println(N-preans);

 }
}