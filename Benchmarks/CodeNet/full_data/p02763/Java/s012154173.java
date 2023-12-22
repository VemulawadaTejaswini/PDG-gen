import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int length = in.nextInt();
      	String str = in.next();
		int input = in.nextInt(); 
      	char[] charArray = str.toCharArray();
      
		for (int i = 0; i < inputs; i++) {
          	int type = in.nextInt();  
          	if (type == 1) {
               	int pos = in.nextInt();
              	String c = in.next();
              	charArray[pos - 1] = (char) c;              
            } else if (type == 2) {
				int start = in.nextInt() - 1;
              	int end = in.nextInt() - 1;         
             	Set<Character> testCount = new HashSet<>();
              	for (int j = start; j <= end; j++) {
              		testCount.add(charArray[j]);
                }
              	System.out.println(testCount.size());
            }
        }      
      
    }
 
}