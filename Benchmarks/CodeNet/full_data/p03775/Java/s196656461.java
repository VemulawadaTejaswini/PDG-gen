import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        long n=sc.nextLong(),a=0;
      	int s=(int)Math.sqrt(n);
        for(int i=1;i<=s;i++){
            if(n%i==0) a=i;
        }
        System.out.println(1+(int)Math.log10(n/a));
    }
}