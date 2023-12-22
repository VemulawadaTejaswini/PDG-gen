import java.util.*;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        string s = "";
        while(true){
            if(n%-2 == 0){
                s = "0" + s;
            }else{
                s = "1" + s;
                n--;
            }
            if(n/-2 == 0) break;
            n /= -2;
        }
        System.out.println(s);
    }
}