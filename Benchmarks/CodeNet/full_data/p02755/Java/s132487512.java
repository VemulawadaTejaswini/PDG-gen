import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1; i<Integer.MAX_VALUE; i++){
            int val1 = (int)(0.08 * i);
            int val2 = (int)(0.1 * i);
            if(val1 == a && val2 == b){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}