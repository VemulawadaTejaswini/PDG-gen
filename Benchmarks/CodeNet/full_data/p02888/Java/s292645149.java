import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)l[i]=sc.nextInt();

        Arrays.sort(l);
        int ans=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int max = l[i]+l[j]-1;
                int c = Arrays.binarySearch(l,max);
                if(c<0)c=-(c+2);
                if(c==n)c--;
                if(c>j)ans+=c-j;
            }
        }

        System.out.println(ans);
    }

}


