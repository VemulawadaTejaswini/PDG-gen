import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String s = sc.next();

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                String subS = s.substring(i, i + 1);
                if(subS.equals("B")){
                    if(sb.length() != 0){
                        sb.setLength(sb.length() - 1);
                    }
                }else{
                    sb.append(subS);
                }
            }

            System.out.println(sb.toString());
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}