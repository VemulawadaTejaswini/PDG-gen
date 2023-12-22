import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());

        int sum=0;
        int parts = 0;
        int ansP =0;

        for(int k =1 ; k<K+1 ; k++){
            for(int i =1 ; i<K+1 ; i++){
                for(int j =1 ; j<K+1 ; j++){
                    parts= uclid(i,j);
                    ansP = uclid(k,parts);
                    sum = sum + ansP;
                }
            }
        }
        System.out.println(sum);
    }


    public static  int uclid(int m,int n) {
        int r;        
        r = m % n;    
        while ( r > 0 )  {  
            m = n; n = r;    
            r = m % n;
        }
        return n;
    }
}