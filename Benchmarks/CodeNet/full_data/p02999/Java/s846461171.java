import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        if(X < A) {
            System.out.println(0);
        }else {
            System.out.println(10);
        }
    }
}