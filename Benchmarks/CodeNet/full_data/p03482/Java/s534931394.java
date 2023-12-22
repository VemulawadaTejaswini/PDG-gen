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

        int max = 0;
        int len = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                len++;
            }else{
                len = 1;
            }
            if(len > max){
                max = len;
            }
        }
        System.out.println(Math.max(ans1, max));
	}
}
