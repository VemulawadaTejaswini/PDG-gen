import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long H = sn.nextInt();
        long W = sn.nextInt();
        long area = H * W;
        long result = 0;
        

        if(H == 1 | W == 1){
            result = 1;
        }else{
            if(area % 2 == 0){
                result = area/2;
            }else{
                result = area/2+1;
        }

        

        System.out.println(result);
    }
}