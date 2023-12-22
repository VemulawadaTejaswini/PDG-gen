import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int[][] num = new int[26][2];
        for(int i=0; i<s.length(); i++){
            num[(int)(s.charAt(i) - 'a')][0] = s.charAt(i);
            num[(int)(s.charAt(i) - 'a')][1]++;
        }

        Arrays.sort(num, (a, b) -> Integer.compare(a[1], b[1]));

        int ans = 0;
        if(num[24][1]+num[25][1] <= s.length()-2){
            if(s.length() % 2 == 0){
                ans = 2;
            }else{
                ans = 1;
            }
        }else if(num[24][1]+num[25][1] == s.length()-1){
            char third = (char)(num[23][0]);
            int pos = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == third) pos = i;
            }
            if(pos == 0 || pos == s.length()-1){
                if(s.length() % 2 == 0){
                    ans = 2;
                }else{
                    ans = 1;
                }
            }else{
                if(s.charAt(pos-1) == s.charAt(pos+1)){
                    ans = 2;
                }else{
                    ans = 1;
                }
            }
        }else{
            ans = 2;
        }



        if(ans == 1){
            System.out.println("First");
        }else{
            System.out.println("Second");
        }
    }
}