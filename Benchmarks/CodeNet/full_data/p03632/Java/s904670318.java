import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sm=c,bg=d;
        if(a>c){
            sm=a;
        }
        if(b<d){
            bg=b;
        }
        if(bg>sm){
            System.out.println(bg-sm);

        }
        else{
            System.out.println(0);
        }
       
    }
}