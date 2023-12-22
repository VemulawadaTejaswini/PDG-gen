
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S=scanner.next();
        int w=scanner.nextInt();
        for(int i=0;i<S.length();i++){
            if(i%w==0){
                System.out.print(S.charAt(i));
            }
        }
        System.out.println();
    }
}