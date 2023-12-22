import java.util.*;
public class Main {
public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 整数の入力
            String N = sc.next();
            String[] N2 = N.split("");
            // スペース区切りの整数の入力

        
        int counter = 0;
        boolean hasA = false;
        boolean hasAB = false;
        for(String each: N2){
            
            if(hasAB && each.equals("C")){
                counter++;
                continue;
            }else{
                hasAB = false;
            }

            if(hasA && each.equals("B")){
                hasAB = true;
                continue;
            }else{
                hasA = false;
            }
            if (each.equals("A")){
                hasA = true;
                continue;
            }else {
                hasA = false;
                hasAB = false;
            }
        }
          System.out.println(counter);
    }
}