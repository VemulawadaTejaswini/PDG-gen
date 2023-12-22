import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] ar=new long[n];
        ar[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            ar[i]=ar[i-1]+sc.nextInt();
        }
        TreeMap<Long,Integer> map=new TreeMap<>();
        long z=0;
        map.put(z, 1);
        int total=0;
        for(int i=0;i<n;i++){
            long rem=ar[i]%m;
            if(map.containsKey(rem)){
                int x=map.get(rem);
                total+=x;
                x+=1;
                map.put(rem, x);
            }
            else{
                map.put(rem,1);
            }
        }
        System.out.println(total);
    }      
}