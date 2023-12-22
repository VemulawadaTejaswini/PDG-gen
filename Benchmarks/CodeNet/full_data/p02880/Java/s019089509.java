import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int N = scanner.nextInt();
        
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                set.add(i*j);
            }
        }
        
        if(set.contains(N)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
