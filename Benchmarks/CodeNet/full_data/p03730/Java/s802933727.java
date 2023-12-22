    import java.util.Scanner;
    
    class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            sc.close();
 
            for(int i = 1; i < 100010; i++)  {
         		if( A*i%B==C) {
         			System.out.println("Yes");
         			System.exit(0);
         		}
             }
            System.out.println("No");
        }
    }