import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Long n=sc.nextLong();
        Long k=(long)Math.sqrt(n)+1;
        long min=n;
        for(int i=1;i<=k;i++){
            if(n%i==0){
                if(min>i+n/i-2){
                    min=i+n/i-2;
                }
            }
        }
        System.out.println(min);
    }
}
