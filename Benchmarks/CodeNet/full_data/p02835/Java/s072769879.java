import java.util.*;
 
public class Main {
    public static void main (String[] args) {
        //Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String NString = scanner.next();
        String[] arr = NString.split(" ");
        StringBuilder sb = new StringBuilder();
        int  a = Integer.valueOf(arr[0]);
        int  b = Integer.valueOf(arr[1]);
        int  c = Integer.valueOf(arr[2]);

        sb.append((a + b + c) < 22 ? "win" : "bust");
        System.out.println(sb);
    }
}