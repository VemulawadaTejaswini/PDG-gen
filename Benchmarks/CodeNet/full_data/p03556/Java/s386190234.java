import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long max = 0;
        for(int i = 0;i<Math.sqrt(a);i++){
            if(max<i*i && i*i<=a){
                max = i*i;
                // System.out.println(i*i);
            }
        }
        System.out.println(max);
        // System.out.println(Math.sqrt(271828169));
    }
}