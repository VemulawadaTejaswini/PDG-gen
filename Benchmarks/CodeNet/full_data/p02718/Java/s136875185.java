import java.util.Scanner;
public class Main{
 	public static void main(String[]args){
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
       	int m = sc.nextInt();
      
      	int counter = 0;
       	int [] nVotes = new int[n];
      	for(int i = 0; i < n; i++){
		 	nVotes[i] = sc.nextInt();
		 	counter += nVotes[i];
	 	}
      	
       	int temp = nVotes[m];
	 	if((1/(4 * m))*counter <= temp){
		 	System.out.println("YES");
	 	}else{
		 	System.out.println("NO");
	 	}
      
    }
}