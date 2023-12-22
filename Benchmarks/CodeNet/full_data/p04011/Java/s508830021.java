import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n=Integer.parseInt(line);
        line = sc.nextLine();
        int k=Integer.parseInt(line);
        line = sc.nextLine();
        int q=Integer.parseInt(line);
        line = sc.nextLine();
        int p=Integer.parseInt(line);
        int ans=0;
        for(int i=0;i<n;i++){
            if(i<k)ans+=q;
            else ans+=p;
        }
        System.out.println(ans);
        
    }
}