import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] a = new int[N];
       
        int wa=0;
        int ac=0;
//        int a=0;
        for (int i=0; i<M; i++){
            int P = sc.nextInt()-1;
            String S=sc.next();
            if(a[P]==-1){
            }
            else if(S.equals("AC")){
                    wa=wa+a[P];
                    ac++;
                    a[P]=-1;
                }
                else if(S.equals("WA")){
                    a[P]++;
                }

        }

        //for (int i=0;i<M;i++){
            System.out.println(ac+" "+wa);
        //}

        
    }
}
