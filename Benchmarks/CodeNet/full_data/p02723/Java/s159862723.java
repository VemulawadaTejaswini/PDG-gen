    import java.util.*;
    import java.math.*;
             
    class Main{
        public static void main(String[] args) {
            
            try(Scanner sc = new Scanner(System.in)){
     
                String str = sc.next();
                stra = str.substring(2, 3);
                strb = str.substring(3, 4);
     
                strc = str.substring(4, 5);
                strd = str.substring(5, 6);
     
                if(stra.equals(strb) && strc.equals(strd))System.out.println("Yes");
                else System.out.println("No");
                
            }catch(Exception e){
                e.printStackTrace();
            }        
        }
    }