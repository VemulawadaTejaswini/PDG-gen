import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split(" ");
        int a = Integer.valueOf(strs[0]);
        int b = Integer.valueOf(strs[1]);
        int max = a + b;
        if(max < a - b) {
            max = a - b;
        }
        if(max < a * b) {
            max = a * b;
        }

        System.out.println(max);
    }
}