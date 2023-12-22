import java.util.*;

public class Main{
	public static void main(String[] argc){
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String tmp = sc.next();
        long l = Long.parseLong(tmp);

        if(s.length() == 1){
            System.out.println(s);
            return;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '1'){
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println(1);

    }
}