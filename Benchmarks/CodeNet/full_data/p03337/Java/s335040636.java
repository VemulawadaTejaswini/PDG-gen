import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b= scn.nextInt();
        int answer = a+b;
        answer = Math.max(answer, a*b);
        answer = Math.max(answer,a-b);
        System.out.println(answer);
    }
}
