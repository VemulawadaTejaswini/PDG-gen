import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        Set<String> set = new HashSet<>();
        for(int i =0;i<n;i++){
            s[i] = sc.next();
            set.add(s[i]);
        }
        int m = sc.nextInt();
        String[] t = new String[m];
        for(int i = 0;i<m;i++)t[i] = sc.next();
        int ans = 0;
        for(String e :set){
            int tmp = 0;
            for(int i = 0;i<n;i++)if(e.equals(s[i]))tmp++;
            for(int i = 0;i<m;i++)if(e.equals(t[i]))tmp--;
            if(tmp>ans) ans = tmp;
        }
        System.out.println(ans);
    }
}
