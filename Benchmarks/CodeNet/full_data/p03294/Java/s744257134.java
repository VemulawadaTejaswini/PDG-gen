import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] num = new int[n];
        for (int i=0;i<n;i++){
            num[i] = cin.nextInt();
        }

        int res= 0;
        for (int i=0;i<n;i++){
            res = res+num[i];
        }

        System.out.println(res-n);

    }

}