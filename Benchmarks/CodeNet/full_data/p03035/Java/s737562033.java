import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a > 12){
            System.out.println(b);
        }else if(a >= 6){
            System.out.println(b / 2);
        }else{
            System.out.println(0);
        }
    }
}