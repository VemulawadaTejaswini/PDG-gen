import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S  = sc.next();

        int count =0;
        while ( true ) {
            if(S.contains("01")){
                int idx= S.indexOf("01");
                S= S.substring(0,idx) +S.substring(idx+2);
                count++;
                count++;
            }else if(S.contains("10")){
                int idx= S.indexOf("10");
                S= S.substring(0,idx) +S.substring(idx+2);
                count++;
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);


    }
}