import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        String answer = "No";
        if(a+b>=c) answer = "Yes";
        System.out.println(answer);
    }
}
