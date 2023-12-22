import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int P[] = new int[N];
    int countI = 1;
    for(int i=0; i<N; i++) {
    int b = scan.nextInt();
    P[i] = b;
    }
    int j = 1;
    int Min = P[0];
    while(j<N) {
    	if(P[j]<Min) {
    		Min = P[j];
    		countI++;
    	}
    	j++;
    }
    System.out.println(countI);
  }
}