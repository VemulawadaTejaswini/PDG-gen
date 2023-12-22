import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String s = scan.next();
        int c = 0;
        int f = 1;
        for(int i = 0; i < n; i++){
            if(a + b <= c || s.charAt(i) == 'c'){
                System.out.println("No");
            }else if(s.charAt(i) == 'a'){
                System.out.println("Yes");
                c++;
            }else if(s.charAt(i) == 'b' && f <= b){
                System.out.println("Yes");
                c++;
                f++;
            }else{
                System.out.println("No");
            }
        }
        scan.close();
    }
}
