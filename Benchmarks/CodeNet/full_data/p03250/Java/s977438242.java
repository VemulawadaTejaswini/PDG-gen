import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
      int i2=sc.nextInt();
      int i3=sc.nextInt();
      int ans=Math.max((i+i2*10+i3),(i*10+i2+i3));
        System.out.println(ans);
    }
}