
import java.util.Scanner;

public class Main {
    public static int findMinCost(int heights[],int k){
        int n = heights.length;
        int[] min = new int[n];
        min[0] = 0;
        min[1] = Math.abs(heights[1]-heights[0]);
        for(int i=2;i<n;i++){
            int temp;
            min[i] = Integer.MAX_VALUE;
            int count = k;
            for(int j=i-1;count-->0 && j>=0;j--){
                temp = Math.abs(heights[i]-heights[j])+min[j];
                min[i] = Math.min(temp,min[i]);
            }
        }
        return min[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int heights[] = new int[n];
        for(int i=0;i<n;i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(findMinCost(heights,k));
    }
}
