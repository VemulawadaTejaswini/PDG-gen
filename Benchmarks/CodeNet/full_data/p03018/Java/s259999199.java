import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int count = 0;

        str = str.replace("BC", "D");

        while(str.contains("AD")){
            str = str.replaceFirst("AD", "DA");
            count++;
        }
        System.out.println(count);

//        while(str.contains("ABC")){
//            str = str.replaceFirst("ABC", "BCA");
//            count++;
//        }
//        System.out.println(count);
    }
}