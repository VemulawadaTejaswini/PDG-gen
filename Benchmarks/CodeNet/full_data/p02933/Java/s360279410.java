import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        String s = stdIn.next();
        System.out.println(a >= 3200 ? s:"red");
    }
}