
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String revs=sc.next();

        String[] t = {"maerd","remaerd","esare","resare"};

        String s="";

        for(int i=0;i<revs.length();i++){
            s+=revs.charAt(revs.length()-i-1);
        }

        while(true){
            if(s.length()==0){
                System.out.println("YES");
                return;
            }
            boolean found =false;
            //System.out.println(s);
            for(int i=0;i<4;i++) {
                if (t[i].length()<=s.length()&&t[i].equals(s.substring(0, t[i].length()))) {
                    found =true;
                    s = s.substring(t[i].length(), s.length());
                }
            }
            if(!found){
                System.out.println("NO");
                return;
            }
        }


    }
}
