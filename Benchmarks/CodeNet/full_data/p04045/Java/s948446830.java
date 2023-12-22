import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();

        Set<Integer> set = new HashSet<>();
        int min = 10;

        for(int i = 0; i < d;i++){
            int k = scan.nextInt();
            set.add(k);
        }

        String s = n + "";
        String res = "";
        for(int i = 0; i < s.length() ; i++){
            if(set.contains(Integer.parseInt(String.valueOf(s.charAt(i))))){
                for(int j = Integer.parseInt(String.valueOf(s.charAt(i)))+1; i < 10; i++ ){
                    if(!set.contains(j)){
                        min = j;
                        break;
                    }
                }
                res+= ""+min;
                continue;
            }

            res+=""+s.charAt(i);
        }

        System.out.println(res);

    }
}
