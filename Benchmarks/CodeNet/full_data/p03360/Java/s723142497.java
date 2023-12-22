import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        int answer = a+b+c-max +max*(int)(Math.pow(2,d));
        System.out.println(answer);
    }
}