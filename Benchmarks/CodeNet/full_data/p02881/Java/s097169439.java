
import java.util.Scanner;
public class Main{
public static void main(String[] args) throws Exception {
    Scanner sc =new Scanner(System.in);
    long N=sc.nextLong();
    double imin=0;
    double jmin=0;
    for(double i=1;i<Math.sqrt(N);i++){
        double j=N/i;
        //jが整数
        if(Math.ceil(j)==Math.floor(j)){
            //j>=iの時暫定のi,jの最大値保存
            if(j>=i){
                imin=i;
                jmin=j; 
            }
            //j<iになったらbreak
            else{
                break;
            }
        }
    }
    int Ans = (int)(imin+jmin-2);
    System.out.println(Ans);
    sc.close();
}
}
