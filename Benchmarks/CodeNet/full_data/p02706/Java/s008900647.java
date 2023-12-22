import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());

            for(int i = 0; i < m; i++){
                n -= Integer.parseInt(sc.next());
            }

            if(n < 0) System.out.println(-1);
            else System.out.println(n);
            
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}