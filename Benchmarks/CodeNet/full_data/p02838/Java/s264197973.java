import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        long lst[] = new long[a];
        long ans = 0;
        for (int i = 0; i < a; i++){
            lst[i] = scan.nextLong();
        }
        for(int i = 0; i < a - 1; i++){
            for(int j = i + 1; j < a; j++){
                String ni = Long.toBinaryString(lst[i]);
                String nj = Long.toBinaryString(lst[j]);
                int len = Math.min(ni.length(),nj.length());
                for(int k = 0; k < len; k++){
                    String n_i = ni.substring(ni.length() - k - 1, ni.length() - k);
                    String n_j = nj.substring(nj.length() - k - 1, nj.length() - k);
                    if(!(n_i.equals(n_j))) ans += Math.pow(2,k);
                }
                if(ni.length()>nj.length()){
                    for(int k = nj.length(); k < ni.length(); k++){
                        String n_i = ni.substring(ni.length() - k - 1, ni.length() - k);
                        if(n_i.equals("1")) ans += Math.pow(2,k);
                    }
                }else if(ni.length()<nj.length()){
                    for(int k = ni.length(); k < nj.length(); k++){
                        String n_j = nj.substring(nj.length() - k - 1, nj.length() - k);
                        if(n_j.equals("1")) ans += Math.pow(2,k);
                    }
                }
                if(ans > ((int)Math.pow(10,9)+7)) ans %= ((int)Math.pow(10,9)+7);
            }
        }
        System.out.println(ans%((int)Math.pow(10,9)+7));
    }
}
