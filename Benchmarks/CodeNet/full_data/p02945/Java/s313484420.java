import java,util.*;
class　Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int answer = Math.max(a+b,a-b);
        answer =Math.max(answer,a*b);
        System.out.println(answer);
    }
}