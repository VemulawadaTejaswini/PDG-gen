import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean[] a = new boolean[x+1];
        a[0] = true;
        for (int i = 100; i < 106; i++) {
            for (int j = i; j < x+1; j++) {
                if(a[j-i]){
                    a[j] = true;
                }
            }
        }
        System.out.println(a[x] ? "1" : "0");
        sc.close();

    }

}
