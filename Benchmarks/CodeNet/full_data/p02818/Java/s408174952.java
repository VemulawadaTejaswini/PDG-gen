import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),k=sc.nextLong();
        long adif=k-a;
        if(a<k){
            a=0;
        }else{
            a=a-k;
        }
        if(adif>0){
            if(b<adif){
                b=0;
            }else{
                b=b-adif;
            }
        }
        System.out.println(a +" " +b);
    }
}
