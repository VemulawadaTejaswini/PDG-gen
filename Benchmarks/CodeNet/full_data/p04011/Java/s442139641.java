import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //泊数
        int k = sc.nextInt(); //泊数
        int x = sc.nextInt(); //金額
        int y = sc.nextInt(); //金額
        
        if (n > k){
        System.out.println(x * k + y(n - k));
        }else{
        System.out.println(x * n);
        }
    }
}