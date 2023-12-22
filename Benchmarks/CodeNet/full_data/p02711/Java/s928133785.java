import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String list[] = N.split("");
        for(int i = 0; i < list.length; i++){
            if(list[i].equals("7")){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
