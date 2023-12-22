import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);a.add(4);a.add(8);a.add(16);a.add(32);a.add(64);
        for(int i = scan.nextInt(); i >= 1; i--){
            if(a.contains(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(1);
        scan.close();
    }
}