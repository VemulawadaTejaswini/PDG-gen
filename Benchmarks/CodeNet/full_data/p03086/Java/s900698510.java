import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.next();
        int answer = 0;
        int instance = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='A'||s.charAt(i)=='C'||s.charAt(i)=='G'||s.charAt(i)=='T'){
                instance++;
                if (instance>answer){
                    answer = instance;
                }
            }else{
                instance = 0;
            }
        }
        System.out.println(answer);
    }

}