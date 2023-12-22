import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int height = 0;
        for (int i =1;i<=999;i++){
            height +=i;
            if (height>=a){
                System.out.println(Math.min(height-a,height+i+1-b));  
                break;
            }
        }      
    }
}