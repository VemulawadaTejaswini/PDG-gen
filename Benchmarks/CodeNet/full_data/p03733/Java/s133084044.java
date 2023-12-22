import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            int time = Integer.parseInt(sc.next());

            int beforeNum = 0;
            int notOyu = 0;

            for(int i = 0; i < n; i++){
                int num = Integer.parseInt(sc.next());
                if(i > 0 && num - beforeNum > time) notOyu += num - beforeNum - time;
                beforeNum = num;
            }

            System.out.println(beforeNum + time - notOyu);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}