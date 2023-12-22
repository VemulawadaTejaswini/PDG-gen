
import java.util.Scanner;
import java.util.Arrays;
import static java.util.Arrays.sort;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
        }
        sort(ary);
        Card[] change = new Card[m];
        for(int i = 0;i < m;i++){
            change[i] = new Card(sc.nextInt(),sc.nextInt());
        }
        quick_sort(change,0,m-1);
        int count = 0;
        
        for(int i = m-1;i >= 0;i--){
            int p = 0;
            //System.out.println("poyo");
            if(ary[count]>=change[i].num)break;
            while(ary[count]<change[i].num&&p<change[i].max_change){
                ary[count] = change[i].num;
                count++;
                p++;
            }
        }
        long ans = 0;
        for(int i = 0;i < n;i++){
            ans += ary[i];
        }
        System.out.print(ans);
        
    }
    static void quick_sort(Card[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2].num;
        int l = left, r = right;
        Card tmp;
        while(l<=r) {
            while(d[l].num < p) { l++; }
            while(d[r].num > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
    
}

class Card {
    int max_change;
    int num;
    Card(int i,int j){
        max_change = i;
        num = j;
    }
    @Override
    public String toString(){
        return max_change + ":" + num;
    }
}
