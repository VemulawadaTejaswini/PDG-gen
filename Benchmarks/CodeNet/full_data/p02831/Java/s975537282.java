import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long s = 0;
        for(int i = 1 ; i < a ; i++ ){
            if(a % i == 0 && b % i == 0){
                s = i;
            }
        }
        long q = a * b / s;
        System.out.println(q);
        sc.close();
    }
}