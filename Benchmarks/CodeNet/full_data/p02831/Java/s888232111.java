import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
      	int M = sc.nextInt();
      	boolean[] c = new boolean[100000];
        int Answer, Min, i;
          
        if(N <= M){
        	Min = N;
        } else {
        	Min = N;
        }
          
        for (i=1; i<Min; i++){
        	if(N%i==0 && M%i==0){
            	c[i] = true;
            }          
        }
      
        Answer = N * M;
      
        for (i=0; i<Min; i++){
        	if(c[i] == true){		
        		Answer = Answer / i;
            }
        }
      
        System.out.print(Answer);

	return;

	}
}