import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);
        String[] xStr = sc.nextLine().split(" ");
        int ans = 0;
        for(int i=0;i<n;i++){
            if(i == 0){
                ans = Math.abs(Integer.parseInt(xStr[i]) - x);
            }else{
                ans = calc(Math.abs(Integer.parseInt(xStr[i]) - x), ans);
            }
        }
        System.out.println(ans);
    }
    
    public static int calc(int a, int b){
        int wk;
        if(a < b){
            wk = a;
            a = b;
            b = wk;
        }
        int rt = a % b;
        
        if(rt != 0){
            return calc(b, rt);
        }else{
            return b;
        }
    }
          
}