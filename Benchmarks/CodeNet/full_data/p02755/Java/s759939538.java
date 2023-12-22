import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int chi = 0;
        int s = -1;
        for(int i = 0 ; i <= 1000 && chi == 0; i++ ){
            int aa = (int)(i * 0.08);
            double bb = (int)(i * 0.1);
            if(a == aa && b == bb){
                chi = 1;
                s = i;
            }
        }
        System.out.println(s);
    }
}