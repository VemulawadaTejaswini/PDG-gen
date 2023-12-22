import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i = 0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int tmp = h[0] - 1;
        boolean ansFlag = true;
        for(int i: h){
            tmp += 1;
            if(i > tmp){
                ansFlag = false;
                break;
            }
        }
        if(ansFlag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}