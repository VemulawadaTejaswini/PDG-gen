import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int[] a = new int[100];
        int cnt = 0;

        for(int i=1;i<=9;i++)
            for(int j=i;j<=9;j++)
                a[cnt++] = i*j;

        int n = cin.nextInt();

        for(int i=0;i<cnt;i++){
            if(a[i]==n){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}