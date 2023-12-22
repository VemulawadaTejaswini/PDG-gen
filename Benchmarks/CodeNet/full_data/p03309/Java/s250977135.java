import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String s[]=line.split(" ",0);
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            d[i]=Integer.parseInt(s[i]);
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            count=Math.min(d[i],d[i+1]);
        }
        count-=n;
        
        int p=0;
        int ans=-1;
        while(ans<p||p==-1){
            p=ans;
            ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.max(d[i]-(count+i+1),-(d[i]-(count+i+1)));
        }
            count++;
        }
        System.out.println(p);
        
    }
}