import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList <Number> list = new ArrayList<>();
        int count = 1;
        int ans = 0;
        
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            if(x == count){
                ans++;
                count++;
            }
            list.add(x);
        }
        
        if(ans == 0){
            System.out.println("-1");
        }else{
            System.out.println(N-ans);
        }
   }
}