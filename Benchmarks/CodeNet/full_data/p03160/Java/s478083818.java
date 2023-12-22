import java.util.Scanner;

class Main {


    public static int totalCostIncurred(int[] height) {
        return totalCostHelper(0, height);
    }

    private static int totalCostHelper(int i, int[] height) {
        if(i == height.length - 1) {
            return 0;
        }

        int cost1 = Math.abs(height[i+1]-height[i]) + totalCostHelper(i+1,height);
        int cost2 = i+2 < height.length ? Math.abs(height[i+2]-height[i]) + totalCostHelper(i+2,height): Integer.MAX_VALUE;
        return Math.min(cost1, cost2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = scanner.nextInt();
        int[] height = new int[numberOfStones];

        for(int i=0; i<height.length; i++)
            height[i] = scanner.nextInt();
        System.out.println(totalCostIncurred(height));
    }
}