import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        int m;
        int n;
        if(a>=b){
            if(a>=c){
                max = a;
                m = b;
                n = c;
            }
            else{
                max = c;
                m = a;
                n = b;
            }
        }
        else{
            if(b>=c){
                max = b;
                m = a;
                n = c;
            }
            else{
                max = c;
                m = a;
                n = b;
            }
        }
        max = max - m + max - n;
        if(max%2==0){
            System.out.println(max/2);
        }
        else{
            System.out.println((max+3)/2);
        }
    }
}