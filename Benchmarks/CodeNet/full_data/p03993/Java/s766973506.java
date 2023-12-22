import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt()-1;
        }
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[a[i]] == i) ans++;
        }
        System.out.println(ans/2);
    }
}