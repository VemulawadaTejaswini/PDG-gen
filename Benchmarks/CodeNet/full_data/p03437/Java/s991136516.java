import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(Systme.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();
        if(X%Y==0)System.out.println(-1);
        else System.out.println(X);
    }
}