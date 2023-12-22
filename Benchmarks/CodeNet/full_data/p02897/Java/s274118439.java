import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(new Main().calc(n));

    }

    public double calc(int n){
        int odds = 0;
        if(n % 2 == 0){
            odds = n / 2;
        }else{
            odds = (int)(n / 2) + 1;
        }
        return (double)odds / n;
    }
}
