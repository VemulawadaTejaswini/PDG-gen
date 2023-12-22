import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            a = sc.nextInt();
        }while (a<1 || a>20);
        do {
            b = sc.nextInt();
        }while(b<1 || b>20);
        if (a>10 || b>9){
            System.out.println("-1");
        }else{
            System.out.println(a*b);
        }
    }
}