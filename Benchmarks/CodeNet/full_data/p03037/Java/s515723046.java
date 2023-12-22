import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m= sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int count = 0;
        for(int i =0;i<m;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for(int i = 0;i<=n;i++){
            if(judge(l,r,i,m)){
                count++;
            }
        }
      System.out.println(count);
    }
    public static boolean judge(int[] l,int[] r,int i,int m){
      boolean[] test = new boolean[m];  
      for(int j = 0;j<m;j++){
            for(int k = l[j];k<=r[j];k++){
                if(i==k){
                    test[j] = true;
                    break;
                }
            }
        }
        for(int j =0;j<m;j++){
            if(!test[j]){
                return false;
            }
        }
        return true;
    }
}