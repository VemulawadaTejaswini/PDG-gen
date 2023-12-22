import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int a = 1;
        while((1 << a) <= n){
            sb.append(a + " " + (a+1) + " " + 0 + "\n");
            sb.append(a + " " + (a+1) + " " + (1 << (a-1)) + "\n");
            a++;
        }
        a--;
        int b = 1 << a;
        int last = a + 1;
        for (int i = a; i > 0; i--) {
            int c = (1 << (i-1)) -1;
            if(b + c < n){
                sb.append(i + " " + last + " " + b + "\n");
                b += c+1;
            }
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
