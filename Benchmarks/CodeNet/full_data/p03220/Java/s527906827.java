import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        double a = sc.nextDouble();
        int[] temp = new int[n];
        for(int i = 0;i < n;i++){
            double tpr = t - sc.nextDouble()*0.006;
            temp[i] = (int)Math.abs(a-tpr);
        }
        Arrays.sort(temp);
        System.out.println(temp[0]);
    }
}