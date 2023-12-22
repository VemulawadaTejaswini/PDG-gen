import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        int count = 0;
        while(true){
            if(s.contains("01")){
                s = s.replaceFirst("01", "");
                count++;
            }else if(s.contains("10")){
                s = s.replaceFirst("10", "");
                count++;
            }else{
                break;
            }
        }
        System.out.println(count * 2);
    }
}