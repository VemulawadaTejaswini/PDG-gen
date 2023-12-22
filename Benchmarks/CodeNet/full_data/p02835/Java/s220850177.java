import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 入力
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        sc.close();

        String r = "bust";
        if(A1+A2+A3<22){
            r = "win";
        }
        System.out.println(r);
    }
}