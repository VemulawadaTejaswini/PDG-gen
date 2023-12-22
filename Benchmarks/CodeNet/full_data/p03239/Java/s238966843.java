import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int T = sc.nextInt();
        int result = 1001;
        for (int i=0;i<n;i++){
            int c = sc.nextInt();
            if (sc.nextInt()<=T){
                result = Math.min(c,result);
        }
        if (result==1001){
            System.out.println("TLE");
        }else{ 
            System.out.println(result);
    }
}