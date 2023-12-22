import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();

        int x = b - a;

        int ret = 0;
        while(x > 0){
            ret += x;
            x--;
        }
        ret = ret - b;

        System.out.println(ret);
    }

}
