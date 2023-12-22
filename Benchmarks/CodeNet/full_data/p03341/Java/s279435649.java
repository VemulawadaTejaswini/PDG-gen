import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            String nsLine = sc.next();

            int minI = -1;
            int min = -1;

            for(int i = 0; i < n; i++){

                int countNotE = 0;
                int countNotW = 0;
                
                for(int j = 0; j < i; j++){
                    String nsJ = nsLine.substring(j, j + 1);
                    if(!nsJ.equals("E")) countNotE++;
                }

                for(int k = i + 1; k < n; k++){
                    String nsJ = nsLine.substring(k, k + 1);
                    if(!nsJ.equals("W")) countNotW++;
                }

                if(min == -1){
                    min = countNotE + countNotW;
                    minI = i + 1;
                } else if((countNotE + countNotW) < min){
                    min = countNotE + countNotW;
                    minI = i + 1;
                }
            }

            System.out.println(min);
            

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}