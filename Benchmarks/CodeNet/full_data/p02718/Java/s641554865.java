import java.util.Scanner;
 
	public class Main {
		public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      
      	int N  =sc.nextInt();
       	int M  =sc.nextInt();
          
        int t[] = new int[N];
        int tt =0;
        for(int i=0; i<N; i++){
        	t[i] =sc.nextInt();
        	tt +=t[i];
        }
          int a1 = 0;
          int a = 0;
          int b = 0;
          for(int i=0; i<N; i++){
          	a = tt/(4*M);
            a1 = tt%(4*M);
          if(t[i]>=(a+a1)){
            b++;
            if(b>=M){
          System.out.println("Yes");
              return;
          }
            }
          }
          System.out.println("No");
        }
    }