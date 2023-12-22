import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        char word = a.charAt(0);
        char last = 'N';
        
        while(true){
            if(word == 0)break;
            if(word == 'a'){
                a = a.substring(1);
                last = 'A';
                if(a.length() > 0){
                    word = a.charAt(0);
                }else{
                    break;
                }
                continue;
            }
            if(word == 'b'){
                b = b.substring(1);
                last = 'B';
                if(b.length() > 0){
                    word = b.charAt(0);
                }else{
                    break;
                }
                continue;
            }
            if(word == 'c'){
                c = c.substring(1);
                last = 'C';
                if(c.length() > 0){
                    word = c.charAt(0);
                }else{
                    break;
                }
                continue;
            }
        }
        System.out.println(last);
    }
}
