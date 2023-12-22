import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int[] A = new int[a];
        int ans =0;
        for(int i=0;i<a;i++){
            A[i]=Integer.parseInt(scan.next());
            if(A[i]%b==1)ans++;
        }
        int num = 2;
        while(true){
            for(int i=0;i<a-num+1;i++){
                int p = 0;
                for(int l=i;l<i+num;l++){
                    p+=A[l];
                }
                if(p%b==num)ans++;
            }
            num++;
            if(num==a)break;
        }
        System.out.println(ans);
    }
}
