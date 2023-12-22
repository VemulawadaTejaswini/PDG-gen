import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int cntA = scan.nextInt();
                int cntB = scan.nextInt();
                int cntC = scan.nextInt();
                int tmp = 0;

                tmp = cntB/cntA;

                if(cntC < tmp){
                        System.out.println(cntC);
                }else{
                        System.out.println(tmp);
                }
        }
}