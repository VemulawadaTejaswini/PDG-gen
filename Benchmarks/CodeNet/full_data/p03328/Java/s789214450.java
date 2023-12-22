import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int height = 0;
        for (int i =1;i<=999;i++){
            height +=i;
            if (height>=a){
                System.out.println(height-a);  
                break;
            }
        }      
    }
}