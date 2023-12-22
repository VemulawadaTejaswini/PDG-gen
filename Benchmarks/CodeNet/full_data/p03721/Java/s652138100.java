import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = "";
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<n;i++){
            String input = sc.next();
            int input2 = sc.nextInt();
            for(int j=0;j<input2;j++){
                sb.append(input);
                sb.append(" ");
            } 
        }
        sb.delete(sb.length()-1, sb.length());
        String[] ans = sb.toString().split(" ");
        System.out.println(ans[k-1]);
        sc.close();
    }

}