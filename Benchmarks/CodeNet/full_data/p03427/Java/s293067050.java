
import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        long nu=Long.parseLong(num);
        Set<Long>all=new HashSet<Long>();
        for(long k=0;k<nu;k++){
        long sum=0;
        char[]s=num.toCharArray();
        long ss[]=new long[num.length()];
        for(long i=0;i<num.length();i++){
            ss[(int)i]=Long.parseLong(""+s[(int)i]);
        }
        for(long i=0;i<num.length();i++){
            sum=sum+ss[(int)i];
        }
        all.add(sum);
        nu--;
        num=String.valueOf(nu);

    }
    long max=0;
    for(long k:all){
        if(k>=max){
            max=k;
        }
    }
    System.out.println(max);
    

       

        
        
        }
       
        
    }
        
     
    