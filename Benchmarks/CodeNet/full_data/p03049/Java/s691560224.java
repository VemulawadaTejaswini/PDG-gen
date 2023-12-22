import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] abs = new int[3];
        int ans = 0;
        for(int i = 0; i < n; i++){
            String tmp = sc.next();
            int index = 0;
            while(index < tmp.length()){
                int now = tmp.indexOf("AB", index);
                if(now != -1){
                    index = now+1;
                    ans++;
                }else{
                    break;
                }
            }
            boolean topB = tmp.charAt(0) == 'B' ? true : false;
            boolean lastA = tmp.charAt(tmp.length()-1) == 'A' ? true : false;
            if(topB && lastA){
                abs[0]++;
            }else if(topB){
                abs[1]++;
            }else if(lastA){
                abs[2]++;
            }
        }
        if(abs[0]+abs[1] <= abs[2]){
            System.out.println(ans + abs[0]+abs[1]);
        }else if(abs[0]+abs[2] <= abs[1]){
            System.out.println(ans + abs[0]+abs[2]);
        }else{
            abs[0] -= Math.abs(abs[1]-abs[2]);
            System.out.println(ans + abs[0]+Math.max(abs[1],abs[2]));
        }
    }
}