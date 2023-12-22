import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int[] count = new int[4];
        boolean test = true;
        
        for(int i=0; i<6; i++){
            int N = sc.nextInt();
            count[N-1]++;
        }
        for(int i=0; i<4; i++){
            if(count[i]>2){
                test = false;
            }
        }
        if(test){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}