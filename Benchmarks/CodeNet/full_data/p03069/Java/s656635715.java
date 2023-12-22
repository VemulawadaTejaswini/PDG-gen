import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int countb = 0;
        int countw = 0;

        for (int i = 0; i < s.length(); i++){
            String cha = s.substring(i, i + 1);

            if (cha.equals("#")) {
                countb++;
            } else {
                countw++;
            } 

        }

        if (countb > countw) {
            System.out.println(countw);
        } else if (s.substring(n - 1, n).equals("#")) {
            countb--;
            System.out.println(countb);
        } else {
            System.out.println(countb);
        }


     }
}