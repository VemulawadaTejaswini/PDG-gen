import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int i = 0;
        while(true){
            if((int)Math.pow(B,i)<=A && (int)Math.pow(B,i+1)>A){
                System.out.println(i+1);
                break;
            }
            i++;
        }
    }
}
