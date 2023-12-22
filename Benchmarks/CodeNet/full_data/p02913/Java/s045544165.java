import java.util.*;
import java.lang.*;



public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int shortEnough = 0, tooLong=N/2+1;

        while(shortEnough+1<tooLong){
            int trial = (shortEnough+tooLong)/2;
            boolean found = false;

            Map<String, Integer> dic = new HashMap<>();
            for(int l=0; l<N-trial; l++){
                String current = S.substring(l,l+trial);
                if(dic.containsKey(current) && dic.get(current)<l-trial){
                    found = true;
                    break;
                }else{
                    dic.putIfAbsent(current, l);
                }
            }

            if(found) shortEnough = trial;
            else tooLong = trial;
        }
        System.out.println(shortEnough);
    }
}
