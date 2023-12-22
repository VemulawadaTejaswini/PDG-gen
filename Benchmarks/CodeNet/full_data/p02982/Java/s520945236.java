import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    int D = scanner.nextInt();
	    int X[][] = new int[N][D];
	    for(int i=0;i<N;i++){
	      for(int j=0;j<D;j++){
	        X[i][j] = scanner.nextInt();
	      }
	    }

	    int resultNumber = 0;
	    int temp = 0;
	    for(int i=0;i<N-1;i++){
	      for(int j=i+1;j<N;j++){
	        for(int k=0;k<D;k++){
	          temp += Math.pow((X[i][k] - X[j][k]),2);
	          if(k==D-1){
	            if(Math.sqrt(temp) == (int)Math.sqrt(temp)){
	              resultNumber++;
	            }
	            temp = 0;
	          }
	        }
	      }
	    }
	    System.out.println(resultNumber);
	    scanner.close();
	}

}
