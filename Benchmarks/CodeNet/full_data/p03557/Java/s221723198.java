import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int[] upper_sizes = new int[n];
        int[] middle_sizes = new int[n];
        int[] lower_sizes = new int[n];
        for(int i=0; i<n; i++){
            upper_sizes[i] = Integer.parseInt(sc.next());
        }
        for(int i=0; i<n; i++){
            middle_sizes[i] = Integer.parseInt(sc.next());
        }
        for(int i=0; i<n; i++){
            lower_sizes[i] = Integer.parseInt(sc.next());
        }
        Arrays.parallelSort(upper_sizes);
        Arrays.parallelSort(middle_sizes);
        Arrays.parallelSort(lower_sizes);
        
        long[] middle_patterns = new long[n];
        middle_patterns[0] = binarySearchMax(upper_sizes, middle_sizes[0]-1);
        for(int i=1; i<n; i++){
            middle_patterns[i] = middle_patterns[i-1] + binarySearchMax(upper_sizes, middle_sizes[i]-1);
        }
        
        long sum = 0;
        int a=0;
        for(int i=0; i<n; i++){
            a = binarySearchMax(middle_sizes, lower_sizes[i]-1);
            if(a>0) sum += middle_patterns[a-1];
        }
        
        System.out.println(sum);
    }
    public static int binarySearchMax(int[] dt, int target){
        int left=-1, right=dt.length;
        int mid=-1;
        
        while((right-left)>1){
            mid = left + (right-left)/2;
            
            if(dt[mid] <= target){
                left=mid;
            }else{
                right=mid;
            }
        }
        return left+1;
    }
}