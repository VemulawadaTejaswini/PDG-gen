import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt(); //バイト件数
        int m = stdIn.nextInt(); //働く日数
        double wage = 0;
        double days[] = new double[n];
        double wages[] = new double[n];
        double dw[] = new double[n]; //1日当たり
        
        for(int i = 0; i < n; i++){
            days[i] = stdIn.nextInt();
            wages[i] = stdIn.nextInt();
            dw[i] = wages[i] / days[i];
        }
        
        Main.sort(dw, days, wages, 0, n - 1);
        
        for(int i = n - 1; i >= 0; i--){
            if(days[i] - m >= 0){
                wage += wages[i];
                m = (int)days[i] - m;
            }
            
            if(m == 0){
                break;
            }
        }
        
        
        System.out.println(wage);
    }
    
    public static void sort(double array[], double array2[], double array3[], int left, int right){
        if(left <= right){
            double p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l++;
                }
                while (array[r] > p){
                    r--;
                }
                if (l <= r){
                    double tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    
                    double tmp2 = array2[l];
                    array2[l] = array2[r];
                    array2[r] = tmp2;
                    
                    double tmp3 = array3[l];
                    array3[l] = array3[r];
                    array3[r] = tmp3;
                    
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, array3, left, r);
            Main.sort(array, array2, array3, l, right);
        }
    }
}
