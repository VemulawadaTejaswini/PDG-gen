import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long S=sc.nextLong();
        if(S==1000000000000000000L){
            System.out.println("0 0 1000000000 0 0 1000000000");
            
        }
        if(S<=1000000000){
            System.out.println("0 0 1 0 0 "+String.valueOf(S));
        }else{
            int x1=0;
            int y1=0;
            int x2=1;
            int y2=1000000000;

            long a=S/1000000000L;
            long b=S%1000000000L;

            int x3=(int)a+1;
            int y3=(int)(1000000000-b);

            System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);




        }


    }
}
