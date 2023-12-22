
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            boolean[] booleans=new boolean[(int)1e6];
            long A=scanner.nextLong();
            long B=scanner.nextLong();
            long C=scanner.nextLong();
            long D=scanner.nextLong();
            if(B>D){
                System.out.println("No");
                continue;
            }else if(A<B){
                System.out.println("No");
                continue;
            }
            long init=init(A,B,C);
            if(init<0){
                System.out.println("No");
                continue;
            }
            if(B==D){
                System.out.println("Yes");
                continue;
            }
            boolean res;
            while(true){
                if(init<0){
                    res=false;
                    break;
                }
                if(init<booleans.length){
                    if(booleans[(int)init]){
                        res=true;
                        break;
                    }
                    booleans[(int) init]=true;
                }
                init=next(init,A,B,C,D);
            }
            if(res){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    static long n(long init,long A,long B,long C, long D){
        long result=(long)Math.ceil((C-init)/(double)(D-B));
        if(init+result*(D-B)==C) result++;
        return result;
    }
    static long m(long init,long A,long B,long C, long D,double n){
        long result= (long)Math.ceil(((init-C)+(n)*(D-B))/(double)B);
        return result;
    }
    static long next(long init,long A,long B,long C, long D){
        long n=n(init,A,B,C,D);
        return init+n*(D-B)-m(init,A,B,C,D,n)*B;
    }
    static boolean func(long init,long A,long B,long C,long D,boolean[] booleans){
        if(init<0){
            return false;
        }
        if(init<booleans.length){
            if(booleans[(int)init]){
                return true;
            }
            booleans[(int) init]=true;
        }
        long nextInit=next(init,A,B,C,D);
        return func(nextInit,A,B,C,D,booleans);

    }
    static long init(long A,long B,long C){
        return A-((long)Math.ceil((A-C)/(double)B))*B;
    }
}