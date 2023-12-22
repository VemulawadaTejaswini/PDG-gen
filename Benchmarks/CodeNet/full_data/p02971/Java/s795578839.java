import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[n][3];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=i;
        }
        Comp comp=new Comp();
        comp.set_index(0);
        Arrays.sort(nums,comp);
        for(int i=0;i<n;i++){
            nums[i][2]=i==n-1?nums[n-2][0]:nums[n-1][0];
        }
        comp.set_index(1);
        Arrays.sort(nums,comp);
        for(int i=0;i<n;i++){
            System.out.println(nums[i][2]);
        }
        
    }
}
class Comp implements Comparator {

    int index = 0;

    void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}