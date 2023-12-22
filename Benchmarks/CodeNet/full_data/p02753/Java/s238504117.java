import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
  }
    

}
