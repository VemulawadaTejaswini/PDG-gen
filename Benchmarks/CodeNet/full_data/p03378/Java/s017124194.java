import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            if(s>x){
                a++;
            }else{
                b++;
            }
        }
        System.out.println(Math.min(a,b));
    }
}
