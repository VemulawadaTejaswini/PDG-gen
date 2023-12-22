import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        a = 10 * a + b;
        if(a % 4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}