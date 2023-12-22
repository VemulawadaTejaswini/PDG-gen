import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans = 0;
        if(x<a[0]){
          System.out.println(0);
          System.exit(0);
        }
        for(int i=0;i<N;i++){
          if(x==a[i]){
            x -= a[i];
            ans++;
            break;
          }
          else if(x>a[i]){
            ans++;
            x -= a[i];
          }
          else{
            ans--;
            break;
          }
        }
        if(x!=0) ans--;
        System.out.println(ans);
    }
}
