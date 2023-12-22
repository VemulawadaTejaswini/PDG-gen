import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>10 || b>9){
            System.out.println("-1");
            System.out.println(a+" X "+b+" = "+(a*b)+", but Takahashi cannot do this calculation, so print -1 instead");
        }else{
            System.out.println(a*b);
            System.out.println(a+" X "+b+" = "+(a*b));
        }
    }
}