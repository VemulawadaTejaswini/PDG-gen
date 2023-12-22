import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        int countO=0;
        int countF=0;
        for(int i=0; i<N; i++){
            A[i]=sc.nextLong();
            if(A[i]%4==0){
                countF++;
            }else if(A[i]%2==1){
                countO++;
            }
        }
        String res;
        if(countF>=countO){
            res = "Yes";
        }else{
            res = "No";
        }
        System.out.println(res);
        
        }
    }