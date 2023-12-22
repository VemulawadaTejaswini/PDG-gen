import java.util.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int height = Integer.valueOf(sc.next());
            int width = Integer.valueOf(sc.next());

            long ans = 0;

            if(height % 2 == 0 || width % 2 == 0){
                ans = height * width / 2;
            }else{
                ans = (height * width + 1) / 2;
            }

            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}