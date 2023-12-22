import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] mon = new int[N+1];
        int wa = 0;
        int ac = 0;
        for(int i=0;i<M;i++){
            int p = scan.nextInt();
            String q = scan.next();
            if(mon[p]==0){
                if(q.equals("AC")){
                    ac++;
                    mon[p]=1;
                }else{
                    wa++;
                }
            }
        }

        System.out.println(ac+" "+wa);
    }
}
