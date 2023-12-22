import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int x = stdIn.nextInt();

        if(a <= x)
            if(x - a <= b)
                System.out.println("Yes");
            else
                System.out.println("No");
        else
            System.out.println("No");
                
    }
}