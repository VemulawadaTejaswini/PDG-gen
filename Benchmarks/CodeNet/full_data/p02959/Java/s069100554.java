import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            ArrayList<Integer> monster = new ArrayList<>(); 
            int ans = 0;

            for(int i = 0; i < n + 1; i++){
                monster.add(Integer.parseInt(sc.next()));
            }

            for(int j = 0; j < n; j++){
                int power = Integer.parseInt(sc.next());

                if(power > 0){
                    int powerM = monster.get(j);
                    if(power >= powerM){
                        monster.set(j, 0);
                        power -= powerM;
                        ans += powerM;
                    }else{
                        monster.set(j, powerM - power);
                        ans += power;
                        power = 0;
                    }
                }

                if(power > 0){
                    int powerM = monster.get(j + 1);
                    if(power >= powerM){
                        monster.set(j + 1, 0);
                        power -= powerM;
                        ans += powerM;
                    }else{
                        monster.set(j + 1, powerM - power);
                        ans += power;
                        power = 0;
                    }
                }
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
