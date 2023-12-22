import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int Q = sc.nextInt();
        int check = 0;
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t==1) check++;
            else{
                int f = sc.nextInt();
                String c = sc.next();
                if(check%2==1){
                    if(f==1)S.append(c);
                    else S.insert(0,c);
                }
                else{
                    if(f==1)S.insert(0,c);
                    else S.append(c);
                }
            }
        }
        if(check%2==1) System.out.println(S.reverse());
        else System.out.println(S);
    }
}