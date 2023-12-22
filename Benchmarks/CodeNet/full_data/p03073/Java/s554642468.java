
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        int res1=0;
        int res2=0;
        for(int i=0;i<s.length;i++){
            if(i%2==0){
                if(s[i].equals("0"))res1++;
            }
            else{
                if(s[i].equals("1"))res1++;
            }
        }
        for(int i=0;i<s.length;i++){
            if(i%2==1){
                if(s[i].equals("0"))res2++;
            }
            else{
                if(s[i].equals("1"))res2++;
            }
        }
        System.out.println(Math.min(res1, res2));
    }
}