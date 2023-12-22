import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        int p = scanner.nextInt();
        String ts = scanner.next();
        StringBuilder t = new StringBuilder(ts);
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(i < k){
                ans += getMax(t.charAt(i), r, s, p);
            }else{
                if(t.charAt(i-k) != t.charAt(i)){
                    ans += getMax(t.charAt(i), r, s, p);
                }else{
                    //System.out.println(" t before : " + t);
                    t = t.replace(i, i+1, "?");
                    //System.out.println(" t after : " + t);
                }
            }
            //System.out.println(" char : " + t.charAt(i) + " ans : " + ans);
        }
        System.out.println(ans);
    }
    public static int getMax(char hand, int r, int s, int p){
        if(hand == 'r'){return p;}
        else if(hand == 's'){return r;}
        else{return s;}
    }
}

