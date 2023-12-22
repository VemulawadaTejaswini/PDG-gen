import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int a = 0;
        for(int i = 0; i < n - 2; i++){
            if(s.charAt(i) == 'A' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C' ){
                a++;
            }
        }
        System.out.println(a);
    }
}