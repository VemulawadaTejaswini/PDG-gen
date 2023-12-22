import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        String b= String.valueOf(B);
        String c= String.valueOf(C);
        String d= b+c;
        int D= Integer.valueOf(d);
        System.out.println(A+D);

    }
}