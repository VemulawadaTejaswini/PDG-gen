import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in_num = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < in_num ;i++){
            int a = sc.nextInt();
            if(l.contains(a)){
                System.out.println("NO");
                return;
            }else{
                l.add(a);
            }
        }
        System.out.println("YES");
    }
}