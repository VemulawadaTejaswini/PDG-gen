import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
   
        Scanner sr = new Scanner(System.in);
        int A = sr.nextInt();
        int B = sr.nextInt();
        int C = sr.nextInt();
        int D = sr.nextInt();
        
        int left = A + B;
        int right = C + D;
        
        if(left > right){
            System.out.println("Left");
        }else if(left < right){
            System.out.println("Right");
        }else if(left == right){
            System.out.println("Balanced");
        }
    }
}