
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        c = b / a;
        b = b%a;
        if(0<b) c = c + 1;
        System.out.println(c);             
    } 
}