import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] point = new int[3];
        point[0] = sc.nextInt();
        point[1] = sc.nextInt();
        point[2] = sc.nextInt();
        String t = sc.next();
        int[] machine = new int[n];
        int[] takahashi = new int[n];
        for (int i=0;i<n;i++){
            int j = t.charAt(i);
            if (j=='r')machine[i]=0;
            else if (j=='s')machine[i]=1;
            else machine[i]=2;
        }
        long ans = 0;
        for (int i=0;i<k;i++){
            int j = i;
            int pre = 3;
            while (j<n){
                int win = (machine[j]+2)%3;
                if (pre!=win){
                    ans+=point[win];
                }else {
                    if (j+k<n){
                        while (win==pre||win==(machine[j+k]+2)%3)win=(win+1)%3;
                    }
                }
                pre=win;
                j+=k;
            }
        }
        System.out.println(ans);
    }
}
