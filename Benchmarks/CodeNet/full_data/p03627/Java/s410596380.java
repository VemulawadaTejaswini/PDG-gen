import java.util.*;
public class Main {
    static int[] a;
    static int n;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            c[i] = 0;
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(c[i]==0){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        b[k] = a[i];
                        c[i] = c[j] = 1;
                        k++;
                        break;
                    }
                }
            }
        }
        if(k==0) System.out.println(k);
        else {
            int areamax = 0;
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    int area = b[i] * b[j];
                    if (area > areamax) areamax = area;
                }
            }
            System.out.println(areamax);
        }
    }

}
