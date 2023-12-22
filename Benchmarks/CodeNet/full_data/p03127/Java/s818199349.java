import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums=new int[(int)Math.pow(2,(int)(Math.log(n)/Math.log(2))+1)];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<(int)(Math.log(nums.length)/Math.log(2));i++){
            for(int j=0;j<nums.length/Math.pow(2,i+1);j++){
                nums[(int)Math.pow(2,i+1)*j]=gcm(nums[(int)Math.pow(2,i+1)*j],nums[(int)Math.pow(2,i+1)*j+(int)Math.pow(2,i)]);
                nums[(int)Math.pow(2,i+1)*j+(int)Math.pow(2,i)]=0;
            }
        }
        System.out.println(nums[0]);
    }

    private static int gcm(int n, int m) {
        int tmp;
        while (true) {
            if (n == 0) {
                return m;
            }else if(m==0){
                return n;
            }
            tmp = n;
            n = m;
            m = tmp;
            n = n % m;
            

        }

    }
}