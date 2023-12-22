import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        List<Long> ans = new ArrayList<>();
        while(Q-->0){
            long A = scan.nextLong();
            long B = scan.nextLong();
            long r = (long)(Math.sqrt((double)A*B));
            if(r*r==A*B && A!=B)--r;
            if(r*(r+1)<A*B){
                ans.add(2*r-1);
            }else{
                ans.add(2*(r-1));
            }


            
        }
        for(long i : ans)System.out.println(i);
    }
}