    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args){
     
            MyScanner scanner = new MyScanner();

            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
             String ans1 = "Hello World";
     
             int n1 = 1;
             
             int n2 = A+B;
             
            if( N == n1){
            	System.out.print(ans1);
            	break;
            } else {
            	System.out.print(n2);        	     
            }
        }
      }