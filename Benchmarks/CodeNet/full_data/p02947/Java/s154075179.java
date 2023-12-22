import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        String[] sortedS = new String[n];
        for(int i=0; i<n; i++){
            String s = stdIn.next();
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            sortedS[i] = new String(cs);
        }
        
        Arrays.sort(sortedS);

        long cnt = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(sortedS[i].equals(sortedS[j])){
                    cnt++;
                }else{
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
