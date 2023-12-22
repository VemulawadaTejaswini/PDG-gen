
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        int min = 10;
        for(int i=0;i<5;i++){
            int tmp = a[i]%10;
            if(tmp==0){
            }
            else{
                if(tmp<min){min=tmp;}
                a[i] = (int)a[i]/10;
                a[i]++;
                a[i]*=10;
            }
        }
        int result = 0;
        for(int i=0;i<5;i++){
            result += a[i];
        }
        System.out.println(result-10+min);
    }
}