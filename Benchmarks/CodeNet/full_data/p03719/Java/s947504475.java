import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
       System.out.print("");  int a = stdIn.nextInt();
       System.out.print("");  int b = stdIn.nextInt();
       System.out.print("");  int c = stdIn.nextInt();
       
       if (a <= c && b >= c)
           System.out.println("Yes");
       else
           System.out.println("No");
    }   
}