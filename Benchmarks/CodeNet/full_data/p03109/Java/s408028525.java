import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String answer = "Heisei";
        int year, month, day;
        year = Integer.parseInt(s.substring(0,4));
        month =  Integer.parseInt(s.substring(5,7));
        
        if(year > 2019) answer = "TBD";
        if(year == 2019 && month >= 5) answer = "TBD";

        System.out.println(answer);
    }
}