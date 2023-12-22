import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int d = sc.nextInt()-1;
        char[] s = sc.next().toCharArray();
        boolean block2 = false;
        for(int i = a; i < Math.max(c,d)-1; i++){
            if(s[i] == '#' && s[i+1] == '#'){
                block2 = true;
                break;
            }
        }
        if(block2){
            System.out.println("No");
        }else if(c < d){
            System.out.println("Yes");
        }else{
            boolean road3 = false;
            for(int i = b; i <= d; i++){
                if(s[i-1] == '.' && s[i] == '.' && s[i+1] == '.'){
                    road3 = true;
                    break;
                }
            }
            System.out.println(road3 ? "Yes" : "No");
        }
    }
}