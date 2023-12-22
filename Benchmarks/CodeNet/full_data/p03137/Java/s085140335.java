import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for(int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        
        if(n == 1) {
            System.out.println(x[m-1] - x[0]);
            return;
        }
        if(n >= m) {
            System.out.println(0);
            return;
        }
        
        int[] dists = new int[m-1];
        int[] index = new int[m-1];
        for(int i = 0; i < m - 1; i++) {
            dists[i] = x[i+1] - x[i];
            index[i] = i;
        }
        
        List<Integer> used = new ArrayList<>();
        Set<Integer> divPoint = new HashSet<>();
      //  if(n < m - n) {
            for(int i = 0; i < n - 1; i++) {
                int max = 0;
                int maxIndex = 0;
                for(int j = i; j < m - 1; j++) {
                    if(max < dists[j] && !used.contains(j)) {
                        max = dists[j];
                        maxIndex = index[j];
                    }
                }
                used.add(maxIndex);
                divPoint.add(maxIndex);
                dists[maxIndex] = dists[i];
                index[maxIndex] = index[i];
            }
       // } else {
        /*    for(int i = 0; i < m - 1; i++) {
                divPoint.add(i);
            }
            
            for(int i = 0; i < m - n; i++) {
                int min = 0;
                int minIndex = 0;
                for(int j = 0; j < m - 1; j++) {
                    if(min > dists[j] && !used.contains(j)) {
                        min = dists[j];
                        minIndex = j;
                    }
                }
                used.add(minIndex);
                divPoint.remove(minIndex);
            }
        }*/
        
        int result = 0;
        int left = 0;
        int right = 0;
        for(Iterator iter = divPoint.iterator(); iter.hasNext(); ) {
            right = (int)iter.next();
            result += x[right] - x[left];
            left = right + 1;
        }
        result += x[m-1] - x[left];
        
        System.out.println(result);
        
            
    }           
}