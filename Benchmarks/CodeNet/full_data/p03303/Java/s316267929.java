import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,1));
        for(int i = 1;i<s.length();i++){
            if(i % n == 0){
                sb.append(s.substring(i,i+1));
            }
        }
        s = sb.toString();
        System.out.println(s);
    }
}