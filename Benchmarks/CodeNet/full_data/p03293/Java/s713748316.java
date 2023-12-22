import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int flag = 0;
        
        for (int i=0; i<a.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=i; j<a.length(); j++) {
                sb.append(a.charAt(j));
            } 
            for (int j=0; j<i; j++) {
                sb.append(a.charAt(j));
            }
            if (sb.toString().equals(b)) {
                flag = 1;
                break;
            }
            
        }
        if (flag==1) System.out.println("Yes");
        else System.out.println("No");
    }
}