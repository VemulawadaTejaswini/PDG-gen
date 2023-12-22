import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] temp = new int[n];
        int ans;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(j < i){
                    if (s.charAt(j) == 'W') {
                        temp[i]++;
                    }
                }
                if(i < j){
                    if (s.charAt(j) == 'E') {
                        temp[i]++;
                    }
                }
            }
        }
        ans = temp[0];
        for(int t: temp){
            if(ans > t){
                ans = t;
            }
        }
        System.out.println(ans);
    }
}
