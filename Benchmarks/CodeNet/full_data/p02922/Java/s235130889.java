import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while(0<b){
            b = b - a;
            c++;
        }
        System.out.println(c);             
    } 
}