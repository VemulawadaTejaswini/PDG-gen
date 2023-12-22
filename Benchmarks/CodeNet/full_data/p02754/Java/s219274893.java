import java.util.*;

class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){

            int all = Integer.valueOf(sc.next());
            int blue = Integer.valueOf(sc.next());
            int red = Integer.valueOf(sc.next());

            if(blue == 0) system.out.println(0);
            else if(blue + red >= all && all > blue) system.out.println(blue);
            else if(blue + red >= all && all <= blue) system.out.println(all);
            else{
                int amari = all % (red+blue);
                int count = (all - amari)/(red + blue);
                int blueAll = count * blue;

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