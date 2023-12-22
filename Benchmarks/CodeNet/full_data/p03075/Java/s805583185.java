import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int maxDist =0;
        for (int i=0;i<4;i++){
            if(maxDist<=a[i+1]-a[i]) {
                maxDist = a[i + 1] - a[i];
            }
        }
        if(maxDist>k){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}
