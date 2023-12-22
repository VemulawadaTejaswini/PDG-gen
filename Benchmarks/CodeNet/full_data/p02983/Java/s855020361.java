import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();

        
        long res=2019;
    
        long bai = L/2019;

        if(L%2019==0 || 2019*(bai+1)<=R){
            res = 0;
        }else{
            for(long i=L; i<R; i++){
                for(long j=i+1; j<R+1; j++){
                    res = Math.min(res,(i*j)%2019);
                }
            }
        }
        System.out.println(res);
        
        }
    }