import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str2 = "abcdefghijklmnopqrstuvwxyz";
        int counter[] = new int[str2.length()];
        Arrays.fill(counter,0);
        in.close();

        int flag = 0;

        char moji[] = str.toCharArray();
        char moji2[] = str2.toCharArray();
        Arrays.sort(moji);
        for(int cnt = 0; cnt < str.length(); cnt++){
        	for(int cnt2 = 0; cnt2 < str2.length(); cnt2++){
        		if(moji[cnt] == moji2[cnt2]){
        			counter[cnt2]++;
        		}
        	}
        }
    	for(int cnt = 0; cnt < str2.length(); cnt++){
    		if(counter[cnt] == 0){
    			System.out.println(moji2[cnt]);
    			flag++;
    			break;
    		}
    	}
    	if(flag == 0){
    		System.out.println("None");
    	}



    }
}