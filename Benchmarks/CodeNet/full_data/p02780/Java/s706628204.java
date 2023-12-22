import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        double[] nums = new double[n1];
        for(int i=0; i<n1; i++){
            int num = sc.nextInt();
            //System.out.println(num);
            int um = 0;
            for(int u=0; u<num; u++){
                //System.out.println(u);
                um += u+1;
            }
            nums[i] = (double)um/num;
        }
        
        int N = n1-n2+1;
        double[] anss = new double[N];
        for(int j=0; j<N; j++){
            for(int k=0; k<n2; k++){
                anss[j] += nums[k+j];
            }
        }
        double max = 0;
        for(double dob: anss){
            if(dob>max){
                max = dob;
            }
        }
        System.out.println(max);
    }
}
