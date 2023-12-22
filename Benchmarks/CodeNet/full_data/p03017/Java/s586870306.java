import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char s[] = new char[n+2];
        boolean flag = true;
        s = sc.next().toCharArray();
        for(int i = b; i<=d-1; i++){
            if(s[i] == '#' && s[i+1] == '#'){
                flag = false;
            }
        }
        s[d-1] = '#';
        for(int i=a; i<=c-1; i++){
            if(s[i] == '#' && s[i+1] == '#'){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
