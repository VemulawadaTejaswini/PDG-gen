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
                int min = Math.abs(l[i]-l[j])+1;
                min = Math.max(l[j+1],min);
                ans += count(l,min,max);


            }
        }

        System.out.println(ans);
    }

    private static int count(int[] array,int l,int r){
        int count=0;
        if(r<l)count= 0;
        else {
            int minIndex = Arrays.binarySearch(array, l);
            int maxIndex = Arrays.binarySearch(array, r);
            if(minIndex==maxIndex){
                if(minIndex<0&&maxIndex<0)count= 0;
                else count=1;
            }else{
                if(minIndex<0)minIndex=-(minIndex+1);
                if(maxIndex<0)maxIndex=-(maxIndex+2);
                count = maxIndex-minIndex+1;
            }
        }


        return count;
    }



}


