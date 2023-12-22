import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();int m = sc.nextInt();
        if(n==0) {
            if(m==100) {System.out.println(101); return;}
            System.out.println(m);
        }
        else if(n==1) {
            if(m==100) {System.out.println(10100); return;}
            System.out.println(m*100);
        }
        else 
            if(m==100) {System.out.println(1010000); return;} else
        System.out.println(m*100*100);
    }
}
