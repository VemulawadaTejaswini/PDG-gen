import java.math.BigDecimal;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0;i<a.length-1;i++){
            int j = i +1;
            while(j<a.length){
                if(a[i]==a[j]){
                    for(int k =0;k<a.length;k++){
                        if(k!=i&&k!=j){
                            ans[k] += 1;
                        }
                    }
            }
            j++;
        }
    }
        for(int i = 0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}