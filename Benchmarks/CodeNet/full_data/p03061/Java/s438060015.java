import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[(int) Math.ceil(Math.log(n) / Math.log(2))+1][n+1];
        int[] lengths=new int[nums.length];
        lengths[0]=n;
        for(int i=0;i<n;i++){
            nums[0][i]=sc.nextInt();
        }
        for(int i=1;i<nums.length;i++){
            lengths[i]=lengths[i-1]%2==0?lengths[i-1]/2:lengths[i-1]/2+1;
            for(int j=0;j<lengths[i-1]/2;j++){
                nums[i][j]=Euclid(nums[i-1][j*2],nums[i-1][j*2+1]);
            }
            if(lengths[i-1]%2==1){
                nums[i][lengths[i-1]/2]=nums[i-1][lengths[i-1]-1];
            }
        }
        int output=1;
        int tmp;
        int now;
        for(int i=0;i<n;i++){
            now=i;
            tmp=0;
            for(int j=0;j<nums.length;j++){
                tmp=Euclid(tmp,nums[j][now%2==0?now+1:now-1]);
                now=now/2;
            }
            output=Math.max(tmp,output);
        }
        System.out.println(output);
    }

    private static int Euclid(int n, int m) {
        int tmp;
        if(n==0||m==0){
            return Math.max(n,m);
        }
        while (true) {
            if (n == 0) {
                return m;
            } else if (m == 0) {
                return n;
            }
            tmp = n;
            n = m;
            m = tmp;
            n = n % m;

        }
    }
}