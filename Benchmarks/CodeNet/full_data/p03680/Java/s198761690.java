import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());

            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Boolean> boolList = new ArrayList<>();

            for(int i = 0; i < n; i++){
                list.add(Integer.parseInt(sc.next()));
                boolList.add(false);
            }

            int light = 0;
            int ans = 0;
            while(light != 1 && boolList.get(light) == false){
                boolList.set(light, true);
                int newLight = list.get(light) - 1;
                light = newLight;
                ans++;
            }

            if(light == 1) System.out.println(ans);
            else System.out.println(-1);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}