    import java.util.Scanner;
         
       class Password{
         public static void main(String[] args){
           Scanner stdIn = new Scanner(System.in);
           int N = stdIn.nextInt();
           if(N >= 1 && N <= 9){
            System.out.println(N*N*N);
            }
        }
    }