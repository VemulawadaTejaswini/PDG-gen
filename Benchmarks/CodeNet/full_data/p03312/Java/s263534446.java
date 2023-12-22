import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        long[] imo = new long[n+1];
        
        int sum = 0;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
            imo[i+1] = sum;
        }
        
        long ans = 1L<<30;
        
        for(int j=0; j<2; j++){
            long ff = 0;
            int ffidx = 0;
            long rr = 0;
            int rridx = n-1;
            for(int i=0; i<n; i++){
                if(j==0){
                    if(ff<=rr){
                        ff += a[ffidx];
                        ffidx++;
                    }else{
                        rr += a[rridx];
                        rridx--;
                    }
                }else{
                    if(ff<rr){
                        ff += a[ffidx];
                        ffidx++;
                    }else{
                        rr += a[rridx];
                        rridx--;
                    }
                }
                for(int k=-1; k<2; k++){
                    //にぶたん
                    int result = Arrays.binarySearch(imo, ff+(sum-ff-rr)/2);
                    int ins = (result >= 0) ? result : ~result;
                    ins += k;
                    if(!(0<=ins && ins<imo.length)){
                        continue;
                    }
                    long fmax = Math.max(imo[ins]-ff, ff);
                    long fmin = Math.min(imo[ins]-ff, ff);
                    long rmax = Math.max((sum-imo[ins])-rr, rr);
                    long rmin = Math.min((sum-imo[ins])-rr, rr);
                    long max = Math.max(fmax, rmax);
                    long min = Math.min(fmin, rmin);
                    long res = max-min;
                    if(ans > res){
                        ans = res;
                    }
                    //System.out.println("res!!!!!");
                    //System.out.println(ff+ ";" + (imo[ins]-ff)+ ":"+((sum-imo[ins])-rr) + ":"+rr);
                    //System.out.println("res:" + res);
                    //System.out.println();
                    //System.out.println(ff + (imo[ins]-ff)+((sum-imo[ins])-rr) +rr);
                }
            }
        }
        
        System.out.println(ans);
    }
}
