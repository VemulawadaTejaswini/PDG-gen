import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int sub = 0;
        int sub2 = 0;
        int ans = 999999999;

        for(int i=0;i<A;i++){
            int b = scan.nextInt();
            sub += b*b;
            sub2 += b;
        }

        for(int i=1;i<=999999999;i++){
            int p = sub-2*sub2*i+i*i*A;
            System.out.println(p);
            if(p<=ans){
                ans = p;
            }else{
                break;
            }
        }

        System.out.println(ans);
    }
}
