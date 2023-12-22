import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;



        //0R, 1G, 2B
        boolean[] rgb = new boolean[3];

        for(int i = 0; i < s.length()-2; i++){
            for(int j = i+1; j < s.length()-1; j++){
                for(int k = j+1; k < s.length(); k++){
                    if(s.charAt(i)!=s.charAt(j)&&s.charAt(j)!=s.charAt(k)
                    &&s.charAt(i)!=s.charAt(k)){
                        if(j-i!=k-j){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        

    }
}
