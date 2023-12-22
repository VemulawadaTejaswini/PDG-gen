import java.util.Scanner;
public class Main {
    public static int findMinCost(int[] heights){
        int n = heights.length;
        int min[] = new int[n];
        min[0] = 0;
        min[1] = Math.abs(heights[1]-heights[0]);
        for(int i=2;i<n;i++){
            min[i] = Math.min(Math.abs(heights[i]-heights[i-1])+min[i-1],
                                    Math.abs(heights[i]-heights[i-2])+min[i-2]);
        }
        return min[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int heights[] = new int[n];
        for(int i=0;i<n;i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(findMinCost(heights));
    }
}