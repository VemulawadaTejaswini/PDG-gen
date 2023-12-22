import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=Long.parseLong(sc.next());
        long b=Long.parseLong(sc.next());
        long min=Math.min(a,b);
        long max=Math.max(a,b);
        int res=1;
        for(long i=2;;i++){
            if(min%i==0){
                if(max%i==0){
                    res++;
                    max/=i;
                }
                min/=i;
            }
            if(i>Math.sqrt(min)){
                break;
            }
        }
        System.out.println(res);
        sc.close();
    }
}