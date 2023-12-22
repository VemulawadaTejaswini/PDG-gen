
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l[] = new int[n];
        long ans =0;

        for(int i=0;i<n;i++)l[i]=sc.nextInt();

        Arrays.sort(l);

        for(int i=0;i<n-2;i++)for(int j=i+1;j<n-1;j++){
            int max = l[i]+l[j];
            int min = l[i]-l[j];
            int min_index = Arrays.binarySearch(l,min);
            if(min_index<0)min_index = -(min_index+1);
            else {
                while(true){
                    min_index++;
                    if(l[min_index]!=min)break;
                }
            }

            int max_index = Arrays.binarySearch(l,max);
            if(max_index<0)max_index = -(max_index+1);
            else{
                while(true){
                    max_index--;
                    if(l[max_index]!=max)break;
                }
            }
            if(min_index<=j)min_index = j+1;
            if(max_index<=j)max_index = min_index;
            long tri = max_index-min_index;


            //System.out.println(l[i]+" "+l[j]+" "+min_index+" "+max_index);
            ans += tri;
        }
        System.out.println(ans);
    }
}
