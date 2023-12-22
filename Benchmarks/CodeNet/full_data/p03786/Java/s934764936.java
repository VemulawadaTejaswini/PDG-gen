import java.util.*;

public class Main {

    public static int su(int[] K, int x){
        int summ=0;
        for (int j=0;j<x;j++){
            summ+=K[j];
        }
        return summ;
    }

    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
        int n=re.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++){
            A[i]=re.nextInt();
        }
        Arrays.sort(A);
        int count=0;
        for(int k=1;k<n;k++){
            if(2*su(A,n-k)>=A[n-k]){
                count++;
            }
            else{
                break;
            }
        }
        count++;
        System.out.println(count);

    }
}
