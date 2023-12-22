import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer points[] = new Integer[n+1];
        for(int i=0; i<n+1; i++){
            points[i] = sc.nextInt();
        }
        Arrays.sort(points, Collections.reverseOrder());
        int interval = points[0] - points[n];
        for(int i=1; i<n+1; i++){
            if(points[i-1] - points[i] < interval) interval = points[i-1] - points[i];
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=interval; i++){
            if(interval % i == 0) list.add(i);
        }
        int l = list.size() -1;
        out: while(true){
            interval = list.get(l);
            for(int i=0; i<n+1; i++){
                if((points[i] - points[n]) % interval != 0) break;
                if(i == n) break out;
            }
            l--;
        }
        System.out.println(interval);
    }
}