import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            List<Integer> line = new ArrayList<>();
            line.add(1);
            line.add(1);
            line.add(1);
            line.add(2);
            line.add(1);
            line.add(2);
            line.add(1);
            line.add(5);
            line.add(2);
            line.add(2);
            line.add(1);
            line.add(5);
            line.add(1);
            line.add(2);
            line.add(1);
            line.add(14);
            line.add(1);
            line.add(5);
            line.add(1);
            line.add(5);
            line.add(2);
            line.add(2);
            line.add(1);
            line.add(15);
            line.add(2);
            line.add(2);
            line.add(5);
            line.add(4);
            line.add(1);
            line.add(4);
            line.add(1);
            line.add(51);

            System.out.println(line.get(Integer.valueOf(sc.next())-1));
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}