
import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());

            List<Integer> rei = new ArrayList<>();
            List<Integer> ren = new ArrayList<>();

            int min = Collections.min(rei) + Collections.min(ren);

            for(int i = 0; i < m; i++){
                int sum = rei.get(Integer.parseInt(sc.next())) + ren.get(Integer.parseInt(sc.next())) - Integer.parseInt(sc.next());
                if(sum < min) min = sum;
            }

            System.out.println(min);
            

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}