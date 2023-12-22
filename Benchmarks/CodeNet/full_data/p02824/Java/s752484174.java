import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long v = sc.nextLong();
        int p = sc.nextInt();
        long[] a = new long[n];
        
        Map<Long, Long> map = new HashMap<Long, Long>();
        
        for(int i = 0; i < n; i++){
            long tmp = sc.nextLong();
            a[i] = tmp;
            if(map.containsKey(tmp)){
                map.put(tmp,map.get(tmp)+1);
            }else{
                map.put(tmp,(long)1);
            }
        }
        Arrays.sort(a);
        long border = a[n-p];
        for(int i = 1; i < n; i++){
            a[i] += a[i-1];
        }
        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        
        long[] arr = new long[mapkey.length];
        arr[0] = (long)mapkey[0] * map.get((long)mapkey[0]);
        for(int i = 1; i < mapkey.length; i++){
            arr[i] = arr[i-1] + (long)mapkey[i] * map.get((long)mapkey[i]);
        }
        
        long backCnt = 0;
        for(int i = 0; i < mapkey.length; i++){
            long tmp = (long)mapkey[i];
            if(tmp+m <= border){
                backCnt += map.get(tmp);
                continue;
            }else{
                long back = backCnt + map.get(tmp);
                long remPoint = Math.max(0,m*(v-(back + p-1)));
                if(n-p+1-back <= 0){
                    break;
                }
                long average = (a[n-p]-a[(int)(back-1)]+remPoint) / (n-p+1-back);
                if(average % (n-p+1-back) != 0){
                    average += 1;
                }
                //System.out.println(tmp +" "+ (n-p+1-back) +" "+average + " " + (tmp + m) + " " + remPoint + " " + (a[n-p]-a[(int)(back-1)]+remPoint) );
                if(average > tmp+m){
                    backCnt += map.get(tmp);
                    continue;
                }else{
                    break;
                }
            }
            
        }
        System.out.println(n-backCnt);
    }
}

