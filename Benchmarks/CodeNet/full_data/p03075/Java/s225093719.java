
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        int k=sc.nextInt();

        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(Math.abs(a[i]-a[j])>k){
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}