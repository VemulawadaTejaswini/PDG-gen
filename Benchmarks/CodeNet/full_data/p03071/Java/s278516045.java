import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        int b = t.nextInt();
        int sum = 0; 
        if (a>=b){
            sum+=a;
            a--;
        } else {
            sum+=b;
            b--;
        }
        if (a>=b){
            sum+=a;
            a--;
        } else {
            sum+=b;
            b--;
        }
        System.out.println(sum);
    }   
}