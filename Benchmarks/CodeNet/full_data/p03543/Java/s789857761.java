import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for(int i=0;i<4;i++){
            HashSet<Character> hash = new HashSet<>();
            for(int j=0;j<4;j++)if(i!=j){
                    hash.add(s[j]);
                }
            if(hash.size()==1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");


    }
}
