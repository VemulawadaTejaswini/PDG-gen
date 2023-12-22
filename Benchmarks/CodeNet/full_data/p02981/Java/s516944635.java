import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=scn.nextInt();
        int b=scn.nextInt();
        int answer =n*a;
        if(answer>b) answer=b;
        System.out.println(answer);
    }
}