import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = sc.nextInt();
        int res = last;
        for(int i = 0;i<n-2;i++)
        {
            int t = sc.nextInt();
            res+=Math.min(t,last);
            last = t;

        }
        System.out.println(res+last );
    }
}
