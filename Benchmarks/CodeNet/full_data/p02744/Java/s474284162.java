import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.valueOf(sc.next());

            List<String> list = new ArrayList<>();
            list.add("a");list.add("b");list.add("c");
            list.add("d");list.add("e");list.add("f");
            list.add("g");list.add("h");list.add("i");
            list.add("j");

            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    System.out.print(list.get(j));
                }
                System.out.println();
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}