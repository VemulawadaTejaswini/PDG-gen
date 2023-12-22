import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int h = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());

            Map<Integer, Integer> atkMp = new TreeMap<>();

            double goodMagic = 0;
            int goodMagicAtk = 0;
            int goodMagicMp = 0;

            for(int i = 0; i < n; i++){
                int atkNum = Integer.parseInt(sc.next());
                int mpNum = Integer.parseInt(sc.next());
                double judgeMagic = atkNum/mpNum;

                if(goodmagic < judgeMagic){
                    goodMagic = judgeMagic;
                    goodMagicAtk = atkNum;
                    goodMagicMp = mpNum;
                }

                if(atkMp.get(atkNum) == null) atkMp.put(atkNum, mpNum);
                else{
                    if(atkMp.get(atkNum) > mpNum) atkMp.put(atkNum, mpNum);
                }
            }

            int ans = 0;
            int mod = h % goodMagicAtk;
            if(mod == 0){
                ans = (h/goodMagicAtk)*goodMagicMp;
            }else{
                ans = ((h - mod)/goodMagicAtk)*goodMagicMp;
                if(atkMp.get(mod) != null){
                    if(atkMp.get(mod) < goodMagicMp) ans += goodMagicMp;
                    else ans += goodMagicMp;
                }else{

                }
            }

            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}