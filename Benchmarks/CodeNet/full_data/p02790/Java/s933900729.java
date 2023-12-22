import java.util.Scanner;
import java.lang.StringBuilder;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();

        String ans = "";

        if(n > m) for(int i = 0; i < n;i++) ans.append(Integer.toString(m));
        else for(int i = 0; i < m;i++) ans.append(Integer.toString(n));

        System.out.println(ans);
    }
}