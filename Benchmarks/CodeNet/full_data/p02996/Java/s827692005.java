import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        //受け取る処理
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
            b.add(s.nextInt());
        }
        int sort=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                if(b.get(i)>b.get(i+1)){
                    sort=b.get(i);
                    b.set(i,b.get(i+1));
                    b.set(i+1,sort);
                    sort=0;
                    //ｂも同じように入れ替える
                    sort=a.get(i);
                    a.set(i,a.get(i+1));
                    a.set(i+1,sort);
                }
            }
        }
        //そもそも時間的に無理
        int cnt=0;
        for(int i=0;i<n;i++){
           cnt+=a.get(i);
        }
        if(cnt>b.get(n-1)||a.get(0)>b.get(0)) {
            System.out.print("No");
            System.exit(0);
        }
        int cnt2=0;
        for(int i=0;i<n;i++){
            cnt+=a.get(i);
            if(cnt2>b.get(i)){
                System.out.print("No");
                System.exit(0);
            }
        }
        System.out.print("Yes");
    }
}