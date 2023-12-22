import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        sc.close();
        int ss = s.length();
        int aaa = 0;
        for(int i = 0 ; i < ss ; i++ ){
            aaa += (s.charAt(i) - 48);
        }
        if(n % aaa == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}