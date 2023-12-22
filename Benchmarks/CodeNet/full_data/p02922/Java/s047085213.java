import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int val = 0 ,cnt=0;
        while(val < B){
            val = val+A;
            cnt++;
        }
        System.out.println(cnt);
    }
}