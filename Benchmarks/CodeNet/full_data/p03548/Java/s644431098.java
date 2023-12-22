import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = (x - z)/(y + z);
        if(y + 2*z <= x) {
            System.out.println("座れる人数は:" + n);
        }
        else{
            System.out.println("Y + 2ZがX以下を満たさない");
        }
    }
}