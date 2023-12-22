import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comp comp=new Comp();
        int n=sc.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(nums,comp);
        int time=0;
        for(int i=0;i<n;i++){
            time+=nums[i][0];
            if(nums[i][1]<time){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }

}
class Comp implements Comparator {

    int index = 1;


    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}