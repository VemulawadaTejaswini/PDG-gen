import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.next());
        int b=Integer.parseInt(sc.next());
        int min=math.min(a,b);
        int max=math.max(a,b);
        int res=1;
        for(int i=2;;i++){
            if(i>=math.sqrt(min)){
                break;
            }
            if(min%i==0){
                if(max%i==0){
                    res++;
                    max/=i;
                }
                min/=i;
            }
        }
        System.out.println(res);
        sc.close();
    }
}