import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet hs = new HashSet<Integer>();
        String str = "Yes";
        for(int i = 0; i < 3; i++){
            hs.add(sc.nextInt());    
        }
        if(hs.size() != 2){
            str = "No";
        }
        System.out.println(str);
    }
}
