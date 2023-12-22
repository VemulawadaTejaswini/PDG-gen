import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        int count = 1;
        int ans = 0;
        
        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();
            if(tmp == count){
                ans++;
                count++;
            }
            list.add(tmp);
        }
        
        if(ans == 0){
            System.out.println("-1");
        }else{
        System.out.println(N-ans);
        }
   }
}
