import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    static boolean check(int[] a, int[] b){
        for(int i=0;i<26;++i)if(a[i]!=b[i])return false;
        return true;
    }

    static int pareNum(int[][] cnt){
        int N = cnt.length;
        int res = 0;
        boolean pared[] = new boolean[N];
        for(int i=0;i<N;++i){
            if(pared[i])continue;
            for(int j=i+1;j<N;++j){
                if(check(cnt[i],cnt[j])){
                    pared[i]=pared[j]=true;
                    ++res;
                    break;
                }
            }
        }
        for(int i=0;i<N;++i)if(!pared[i]){
            remain.add(cnt[i]);
            odd.add(N);
        }

        return res;
    }

    static List<int[]> remain = new ArrayList<>();
    static List<Integer> odd = new ArrayList<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] mat = new int[H][W];
        for(int i=0;i<H;++i){
            String s = scan.next();
            for(int j=0;j<W;++j)mat[i][j]=s.charAt(j)-'a';
        }
        int vcnt[][] = new int[H][26];
        for(int i=0;i<H;++i){
            for(int j=0;j<W;++j)vcnt[i][mat[i][j]]++;
        }

        if(pareNum(vcnt)<H/2){
            System.out.println("NO");
            return;
        }
        int hcnt[][] = new int[W][26];
        for(int j=0;j<W;++j){
            for(int i=0;i<H;++i)hcnt[j][mat[i][j]]++;
        }
        if(pareNum(hcnt)<W/2){
            System.out.println("NO");
            return;
        }
        int rem = -1;
        for(int i=0;i<odd.size();++i){
            boolean used = false;
            for(int j=0;j<26;++j)if(remain.get(i)[j]%2==1){
                if((odd.get(i)==H ? W:H)%2==0 || used || (rem>=0 && rem!=j)){
                    System.out.println("NO");
                    return;
                }
                used=true;
                rem=j;
            }
        }

        System.out.println("YES");


    }
}