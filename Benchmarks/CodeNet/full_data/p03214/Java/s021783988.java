import java.util.Scanner;
 
class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        double[] s = new double[n];
        double sum = 0;
        for (int i = 0; i < n ; i++){
            s[i] = sc.nextInt();
            sum += s[i];
        }
 
        double min = Math.abs(avg - s[0]*n);
        int idx = 0;
 
        for (int i = 1; i < n ; i++){
            double tmp = Math.abs(avg - s[i]*n);            
            if (tmp < min){
                min = tmp;
                idx = i;
            }
        }
 
        System.out.println(idx);
    }
}