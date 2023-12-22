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

            for(int i = 0; i < a; i++){
                rei.add(Integer.parseInt(sc.next()));
            }

            for(int i = 0; i < b; i++){
                ren.add(Integer.parseInt(sc.next()));
            }

            int min = Collections.min(rei) + Collections.min(ren);

            for(int i = 0; i < m; i++){
                int sum = 0;
                sum += rei.get(Integer.parseInt(sc.next()) - 1) 
                sum += ren.get(Integer.parseInt(sc.next()) - 1)
                sum -= Integer.parseInt(sc.next());
                if(sum < min) min = sum;
            }

            System.out.println(min);
            

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}