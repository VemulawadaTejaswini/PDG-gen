import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int List [] = new int[100001];
        int root = sc.nextInt();
        List[root]++;
        long opt = 1;
        int max = 0;
        for(int i=1;i<N;i++){
            int num = sc.nextInt();
            List[num]++;
            if(max<num) max= num;
        }
        if(root==0&&List[0]==1){
            for(int i=1;i<max;i++){
                if(List[i]!=0&&List[i+1]!=0){
                    long each = 1;
                    for(int j=0;j<List[i+1];j++)  each=each*List[i]%998244353;
                    opt = opt*each%998244353;
                }
                else{
                    opt = 0;
                    break;
                }
            }
        }
        else opt =0;
        System.out.println(opt);
    }
}