import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<s.length;i++){
            int count = 0;
            for(int j = 0;j<s.length;j++){
                if(i < j){
                    if(s[j] == 'E'){
                        count += 1;
                    }
                }else if(i > j){
                    if(s[j] == 'W'){
                        count += 1;
                    }
                }
            }
            min = Math.min(count,min);
            count = 0;
        }
        System.out.println(min);
    }
}