import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int count = 0;
        if(a ==b ){
            if(a==c){
                count = 3;
            }else{
                count = 2;
            }
        }else if(b==c){
            count = 2;
        }else{
            count = 0;
        }
        System.out.println(count);
    }
}