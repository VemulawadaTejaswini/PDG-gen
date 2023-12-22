import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt(),c=sc.nextInt();
        int[] b = new int[m];
        int ans = 0;
        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            int tmp = 0;
            for(int j = 0;j<m;j++){
                tmp += sc.nextInt()*b[j];
            }
            if(tmp+c>0){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}