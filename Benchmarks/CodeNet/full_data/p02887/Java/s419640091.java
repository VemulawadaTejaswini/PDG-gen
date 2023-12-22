import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        sc.close();
        int res = 1;
        for(int i=0;i<n-1;i++){
            if(s[i]!=s[i+1])res++;
        }
        System.out.println(res);
    }
    
}