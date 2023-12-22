import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String ans = scan.nextInt() < 9 && scan.nextInt() < 9 ? "Yay!" : ":(";
        System.out.println(ans);
    }
}