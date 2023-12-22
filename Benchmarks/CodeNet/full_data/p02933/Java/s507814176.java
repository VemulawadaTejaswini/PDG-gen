import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextFloat();
        }
        float tmp = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        float r = (a[0] + a[1]) / 2;
        for(int i = 2; i < n; i++){
            r = (r + a[i]) / 2;
        }
        System.out.println(r);
    }
}