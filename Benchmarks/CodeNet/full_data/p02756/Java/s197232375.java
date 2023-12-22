import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        String string = "A";

        int cnt = 0;

        for (int i=0; i<q; i++){
            int query = sc.nextInt();
            if (query==1){
                cnt++;
                StringBuffer str = new StringBuffer(string);
                string = str.reverse().toString();

            }else if (query==2){
                int tmpInt = sc.nextInt();
                if (tmpInt==1){
                    String c = sc.next();
                    string = c+string;
                }else if (tmpInt==2){
                    String c = sc.next();
                    string = string+c;
                }
            }
        }

        StringBuffer strS = new StringBuffer(s);
        String revS = strS.toString();

        if (cnt%2==0){
            s = string.replace("A", s);
        }else {
            s = string.replace("A", revS);
        }

        System.out.print(s);

    }
}

