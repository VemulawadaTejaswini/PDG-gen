import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        Comp comp=new Comp();
        comp.setIndex(0);
        Arrays.sort(nums,comp);
        int tmp=0;
        for(int i=0;i<n;i++){
            tmp+=nums[i][1];
            if(tmp>=k){
                System.out.println(nums[i][0]);
                return;
            }
        }
    }
    
 
}
class Comp implements Comparator{
    int index=0;
    void setIndex(int i){
        index=i;
    }
    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }
} 
