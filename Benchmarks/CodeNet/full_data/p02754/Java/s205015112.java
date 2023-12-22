
import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){
 
            long all = Integer.valueOf(sc.next());
            long blue = Integer.valueOf(sc.next());
            long red = Integer.valueOf(sc.next());
 
            if(blue == 0) System.out.println(0);
            else if(blue + red >= all && all > blue) System.out.println(blue);
            else if(blue + red >= all && all <= blue) System.out.println(all);
            else{
                long amari = all % (red+blue);
                long count = (all - amari)/(red + blue);
                long blueAll = count * blue;
 
                if(amari > blue){
                    blueAll += blue;
                }else if(amari <= blue){
                    blueAll += amari;
                }
 
                System.out.println(blueAll);
            }
 
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
