import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        if(n == 100){
            n++;
        }

        System.out.println((int)Math.pow(100, d) * n);
    }
}