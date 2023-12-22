    import java.util.*;
        public class Main {
        	public static void main(String[] args){
        		Scanner sc = new Scanner(System.in);
        		int n = sc.nextInt();
        		int m = sc.nextInt();
              int a[]=new int[n];
                int x=0;
              for(int i=0;i<n;i++){
        		a[i] = sc.nextInt();
                if((1/(4*m))>=a[i]){
                  x++;
                }
              }
        		System.out.print(m>=x);
        	}
        }