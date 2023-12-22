import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int K = Integer.parseInt(sc.next());
        String[] a = new String[str.length()*K];
        int cnt=0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j<K; j++) {
                a[cnt] = str.substring(i, Math.min(str.length(), i+j+1));
                cnt++;
            }
        }

        Arrays.sort(a);
        String pre = "";
        int c = 0;
        for(int i = 0; i<cnt; i++) {
            if(pre.equals(a[i])) continue;

            pre = a[i];
            c++;
            if(c==K) {
                System.out.println(a[i]);
                return;
            }
        }
    }
}