import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int amax = a[a.length-1];
        int cnt=0;
        int sum =0;
        while(N-1-cnt>=0&&b[N-1-cnt]>=amax) {
            sum += b[N-1-cnt];
            cnt++;
            if(sum>=H){
              System.out.println(cnt);
              return;  
            } 
        }
        cnt += (H-sum+amax-1)/amax;
        System.out.println(cnt);
    }
}
