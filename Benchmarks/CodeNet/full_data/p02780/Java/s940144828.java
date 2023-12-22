import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        double[] nums = new double[n1];
        for(int i=0; i<n1; i++){
            int num = sc.nextInt();
            int um = 0;
            for(int u=0; u<num; u++){
                um += u+1;
            }
            nums[i] = (double)um/num;
        }
        
        int N = n1-n2+1;
        double max = 0;
        for(int j=0; j<N; j++){
            double NUM = 0;
            for(int k=0; k<n2; k++){
                NUM += nums[k+j];
            }
            if(NUM>max){
                max = NUM;
            }
        }
        System.out.println(max);
    }
}
