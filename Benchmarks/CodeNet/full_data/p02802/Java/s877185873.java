import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map <Integer,String> map = new HashMap<>();
        int ans = 0;
        int count = 0 ;
        
        
        for(int i=0; i<M; i++){
            int num = sc.nextInt()-1;
            String tmp = sc.next();
            if(tmp.equals("AC") ){
                if(!map.containsKey(num) || map.get(num).equals("WA")){
                    ans++;
                    map.put(num,tmp);
                }
            }else{
                if(!map.containsKey(num) || map.get(num).equals("WA")){
                    count++;
                    map.put(num,tmp);
                }
            }
        }
        
        System.out.print(ans+" ");
        System.out.println(count);
    }
}
