import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
    		Scanner in = new Scanner(System.in);
    		
			char[] ca = in.next().toCharArray();
    		int rotate = in.nextInt();
    		    		
			for (int y = 0; y < ca.length-1; y++){
				if (ca[y] + rotate > 'z'){
					int diff = (int)'z' - (int)ca[y];
					ca[y] = 'a';
					rotate -= diff + 1;
				}
			}
		
			rotate = rotate % 26;			
			for (int x = 0; x < rotate; x++){
				if (ca[ca.length-1] == 'z'){
					ca[ca.length-1] = 'a';
				} else {
					ca[ca.length-1]++;
				}
								
			}
			
			String answer = "";
			for (int x = 0; x < ca.length; x++){
				answer += ca[x];
			}
			
			System.out.println(answer);
			
    		in.close();
    }
}