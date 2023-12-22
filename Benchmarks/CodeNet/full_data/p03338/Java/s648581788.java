import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;
        int ans = 0;
        //アルファベットあるかな
        boolean[] b1 = new boolean[26];
        boolean[] b2 = new boolean[26];
        //区切るところを変えて探す
        for (int i=1;i<N;i++){
            String str1 = s.substring(0,i);
            String str2 = s.substring(i);
            for (int j=0;j<str1.length();j++){//前半
                b1[s1.charAt(j)-97]=true;
            }
            for (int j=0;j<str2.length();j++){//後半
                b2[s2.charAt(j)-97]=true;
            }
            for (int j=0;j<26;j++){//両方にあるか
                if(b1[j] && b2[j]){
                  ans++;
                }
            }
            max = Math.max(max,ans);
        }
        System.out.println(max);
    }
}