import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            int hp = Integer.parseInt(sc.next());

            ArrayList<Integer> throwK = new ArrayList<>();

            int maxAtk = 0;

            for(int i = 0; i < n; i++){
                int atk = Integer.parseInt(sc.next());
                int thr = Integer.parseInt(sc.next());
                if(atk > maxAtk){
                    maxAtk = atk;
                }
                throwK.add(thr);
            }

            Collections.sort(throwK);
            Collections.reverse(throwK);

            int ans = 0;
            while(maxAtk < throwK.get(ans)){
                hp -= throwK.get(ans);
                ans++;
            }

            ans += (hp - hp%maxAtk)/maxAtk; 
            ans++;

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
