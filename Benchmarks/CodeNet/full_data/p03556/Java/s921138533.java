import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        for(int i = 0;i<a;i++){
            if(max<i*i&& i*i<=a){
                max = i*i;
            }
        }
        System.out.println(max);
    }
}