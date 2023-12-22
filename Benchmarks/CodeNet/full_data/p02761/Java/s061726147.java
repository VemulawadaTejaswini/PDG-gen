import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();//ヒント
        int[] s = new int[m];
        int[] c = new int[m];
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        int range = (int)Math.pow(10,n);
        for(int i = 0;i < m;i++){
            s[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
        }
            
        for(int i = 0;i <= range;i++){
            String str = String.valueOf(i);
            if(str.length()==n){
                boolean flag = true;
                for(int j=0;j<m;j++){
                    flag = flag&&(str.charAt(s[j])==c[j]+'0');
                }
                if(flag){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}