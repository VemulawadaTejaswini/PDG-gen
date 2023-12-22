import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = 0;
        if(a%2 == 0){
            res = a/2;
        }
        if(a%2 != 0){
            res = a/2 + 1;
        }
        System.out.println(res);
    }
}