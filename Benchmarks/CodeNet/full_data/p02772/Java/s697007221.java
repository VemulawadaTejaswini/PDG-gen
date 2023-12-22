import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        boolean flg = true;
        for(int i=0;i<A;i++){
            int a = scan.nextInt();
            if(a%2==0){
                if(a%3==0 || a%5==0){
                }else{
                    flg=false;
                    break;
                }
            }
        }
        if(flg){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}
