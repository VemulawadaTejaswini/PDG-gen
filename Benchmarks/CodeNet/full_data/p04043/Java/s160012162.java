import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt=0;
        if(a==5) cnt++;
        if(b==5) cnt++;
        if(c==5) cnt++;
        if(cnt==2 && a+b+c==17)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
