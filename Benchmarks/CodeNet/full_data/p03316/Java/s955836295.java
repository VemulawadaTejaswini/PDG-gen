import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s_n = 0;
        int n_sub = n;

        while(true){
            s_n += n%10;
            n /= 10;
            if(n == 0)break;
        }

        if(n_sub % s_n == 0)System.out.println("Yes");
        else System.out.println("No");

    }
}
