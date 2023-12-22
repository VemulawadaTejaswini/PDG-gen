import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        int Q = sc.nextInt();
        int[] T = new int[Q];
        int reverse = 0;

        for(int i=0; i<Q; i++){
            T[i] = sc.nextInt();
            if(T[i]==1){
                reverse += 1;
            }
            else{
                int F = sc.nextInt();
                String C = sc.next();
                if((F==1 && reverse%2==0) || (F==2 && reverse%2!=0)){
                    S = C + S;
                }
                else{
                    S = S + C;
                }
            }
        }
        if(reverse%2!=0){
            StringBuffer str = new StringBuffer(S);
            S = str.reverse().toString();
        }
        System.out.println(S);
    }
}