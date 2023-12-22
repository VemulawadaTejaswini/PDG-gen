import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int countO=0;
        int countF=0;
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
            if(A[i]%4==0){
                countF++;
            }else if(A[i]%2==1){
                countO++;
            }
        }
        String res;
        if(countF>=countO){
            res = "Yes";
        }else if(countO+countF==N && countF==countO-1){
            res = "Yes";
        }else{
            res = "No";
        }
        System.out.println(res);
        
        }
    }