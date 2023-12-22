import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String S = scan.next();
        final String T = scan.next();
        int result = 0;
        for(int i = 0; i < 3; i++){
            if(S.substring(i,i+1).equals(T.substring(i,i+1))){
                result++;
            }
        }
        System.out.println(result);
        scan.close();
    }
    
}
