import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans, n, i;
        n = sc.nextInt();
        String s = sc.next();

        int doc = 0;
        for ( i = 0; i < n; i++){
            if (s.charAt(i) == '.') doc++;
        }
        ans = doc;

        for ( i = 0; i < n; i++){
            if (s.charAt(i) == '#') doc++;
            if (s.charAt(i) == '.') doc--;
            ans = Math.min(ans,doc);
        }

        System.out.print(ans);
        sc.close();
    }
}