import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= 0 && b >= 0){
            if(a <= b){
                System.out.println(b-a);
            }else{
                System.out.println(a-b+2);
            }
        }else if(a >= 0 || b >= 0){
            System.out.println(Math.abs(Math.abs(a)-Math.abs(b))+1);
        }else{
            if(a <= b){
                System.out.println(b-a);
            }else{
                System.out.println(a-b+2);
            }
        }
    }
}
