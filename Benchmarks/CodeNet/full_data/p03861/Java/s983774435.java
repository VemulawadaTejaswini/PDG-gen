import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextLong();
        int b = sc.nextLong();
        int x = sc.nextLong();
        int count = 0;


        count =(b / x) - (a / x);
        if(a % x == 0){
            
                count++;
            }
        System.out.println(count);
    }
}


