    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args){
     
            Scanner sc = new Scanner(System.in);

            String N = sc.next();
            String A = sc.next();
            String B = sc.next();
            int nValue = Integer.parseInt(N);
            int aValue = Integer.parseInt(A);
            int bValue = Integer.parseInt(B);
             String ans1 = "Hello World";
     
             int n1 = 1;
             
             int n2 = aValue+bValue;
             
            if( nValue == n1){
            	System.out.print(ans1);
            	break;
            } else {
            	System.out.print(n2);        	     
            }
        }
      }