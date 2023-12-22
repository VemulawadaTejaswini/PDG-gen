import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] w = new int[n];

        for(int i=0;i<n;i++)w[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)sum+=w[i];
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=w[i];
            if(sum2>=sum/2){
                System.out.println(Math.abs(2*sum2-sum));
                return;
            }
        }




    }

}
