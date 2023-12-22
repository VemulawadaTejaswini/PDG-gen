import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String out = "EQUAL";
        if(a.length() != b.length()){
            if(a.length() > b.length()){
                out = "GREATER";
            }else{
                out = "LESS";
            }
            System.out.println(out);
            System.exit(0);
        }
        for(int i = 0; i < 100; i++){
            if(Integer.parseInt(String.valueOf(a.charAt(i))) > Integer.parseInt(String.valueOf(b.charAt(i)))){
                out = "GREATER";
                break;
            }else if(Integer.parseInt(String.valueOf(a.charAt(i))) < Integer.parseInt(String.valueOf(b.charAt(i)))){
                out = "LESS";
                break;
            }
        }
        System.out.println(out);
    }
}