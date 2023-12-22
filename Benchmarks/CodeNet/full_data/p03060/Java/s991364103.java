import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);

    	   int N = sc.nextInt();
    	   int[] V = new int[N];
    	   int[] C = new int[N];


    	   for(int i=0; i<N; i++) {
    		   V[i] = sc.nextInt();
    	   }

    	   for(int i=0; i<N; i++) {
    		   C[i] = sc.nextInt();
    	   }

    	   int space = 1;

    	   for(int i = 1; i<=N; i++) {
    		   space =space*2;

    	   }

           int XY[] =new int[N];

           for (int i=0; i<N; i++) {
        	   XY[i] = V[i] -C[i];
           }
           int answer = 0;
           for(int i=0; i<N; i++) {
        	   if(XY[i]>0) {
        		   answer = answer + XY[i];
        	   }

           }
    	   System.out.print(answer);
}
}
