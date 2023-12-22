import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        int plus = a % b;
        int rem = a % b;
        while(true){
            if(rem == c){
                System.out.println("YES");
                break;
            }else if(hs.contains(rem)){
                System.out.println("NO");
                break;
            }else{
                hs.add(rem);
                rem = (rem + plus)%b;
            }
        }
        
    }
}