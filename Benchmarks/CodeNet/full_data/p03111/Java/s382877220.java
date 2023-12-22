import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static ArrayList<Integer>[] rec;
    static int[] tar;
    static int A,B,C;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = sc.nextInt(); B = sc.nextInt(); C = sc.nextInt();
        int[] len = new int[n];
        for(int i=0;i<n;i++) len[i]=sc.nextInt();
        Arrays.sort(len);
        tar = new int[]{C,B,A};
        int ans = Integer.MAX_VALUE/2;
        for(int i=0;i<=n-3;i++){
            ans = Math.min(ans,solve(len,i));
        }
        System.out.println(ans);
    }
    static int solve(int[] len, int numOf){
        if(numOf==0){
            ArrayList<Integer> dic = new ArrayList<>();
            for(int w:len){
                if(w>0) dic.add(w);
            }
            int[] res = new int[3];
            Collections.sort(dic);
            Arrays.fill(res,Integer.MAX_VALUE/2);
            for(int pass=0;pass<3;pass++){
                int idx = -1;
                for(int i=0;i<dic.size();i++){
                    if(Math.abs(res[pass]-tar[pass])>Math.abs(dic.get(i)-tar[pass])){
                        res[pass] = dic.get(i);
                        idx = i;
                    }
                }
                dic.remove(idx);
            }
            int ans = 0;
            for(int i=0;i<3;i++) ans += Math.abs(res[i]-tar[i]);
            return ans;
        }
        int[] backup = new int[len.length];
        System.arraycopy(len,0,backup,0,len.length);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<len.length;i++){
            if(len[i]<0) continue;
            for(int j=i+1;j<len.length;j++){
                if(len[j]<0) continue;
                len[i] += len[j];
                len[j] = -1;
                ans = Math.min(ans,solve(len,numOf-1)+10);
                System.arraycopy(backup,0,len,0,len.length);
            }
        }
        return ans;
    }
}