import java.util.*;

public class Main{
        public  static void main(String[] args){

                int r=calc();
                System.out.println(r);
        }
        static int calc(){
                Scanner sc = new Scanner(System.in);
                int A=sc.nextInt();
                int B=sc.nextInt();
                int rp;
                int rm;
                int rb;
                int r;
                rp = A+B;
                rm = A-B;
                rb = A*B;
                if(rp >= rm && rp >= rb){
                        r = rp;
                }else if(rm >= rp && rm >= rb){
                        r = rm;
                }else{
                        r = rb;
                }
                return r;
        }
}