import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		sc.close();
		
        int ans1;
        if(s.length() %2 == 0){
            ans1 = s.length() / 2;
        }else{
            ans1 = s.length() / 2 + 1;
        }

        int ans2 = 0;
        int len = 1;
        int div = 1;
        ArrayList<Integer> lendata = new ArrayList<Integer>();
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                len++;
            }else{
                lendata.add(len);
                len = 1;
                div++;
            }
            if(len > ans2){
                ans2 = len;
            }
        }
        lendata.add(len);
        int ans3 = 0;
        if(div == 3){
            if(lendata.get(0) == lendata.get(2)){
                ans3 = lendata.get(0) + lendata.get(1);
            }
        }

        System.out.println(Math.max(ans1, Math.max(ans2, ans3)));
	}
}