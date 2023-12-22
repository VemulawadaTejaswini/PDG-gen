import java.util.Scanner;
public class Main{
public static void main(String[] args) throws Exception {
    Scanner sc =new Scanner(System.in);
    long N=sc.nextLong();
    long imin=0;
    long jmin=0;
    for(long i=1;i<Math.sqrt(N);i++){
        if(N%i==0){
            long j = N/i;
            //j>=iの時暫定のi,jの最大値保存
            if(j>=i){
                imin=i;
                jmin=j; 
            }
        }
    }
    long Ans = imin+jmin-2;
    System.out.println(Ans);
    sc.close();
}
}