import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] a = new int[1000000];
        a[0] = s;
        for(int i = 1; i < 1000000; i++){
            if(a[i - 1] % 2 == 0) a[i] = a[i - 1] / 2;
            else a[i] = a[i - 1] * 3 + 1;
            if(i > 2){
                if(a[i] == 1 && a[i - 1] == 2 && a[i - 2] == 4){
                    System.out.println(i + 2);
                    return;
                }
            }
        }
        scan.close();
    }
}