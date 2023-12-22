import java.util.*;
class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner();
      	HashMap<char,char> hm = new HashMap<>();
      	char arr[] = new char[] { 'r','p','s' };
      	hm.put('r', 'p'); hm.put('p','s'); hm.put('s', 'r');
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int r = sc.nexInt(), p = sc.nextInt(), s = sc.nextInt();
      	String comp = sc.nextLine();
      	String hum = "";
      	Integer ans = 0;
     	for (int i = 0; i < comp.length; i ++) {
          	char temp = hm[comp.charAt(i)];
 			if (i - k >= 0 && hum.charAt(i - k) != temp) {
            	hum += temp;
              	if (temp == 'r') ans += r; else if (temp == 's') ans += s;
              	else ans += p;
            }
        	else if (i - k >= 0 && hum.charAt(i - k) == temp) {
            	if (i + k < n) {
                	char temp2 = comp.charAt(i + k);
                  	for (int j = 0; j < 3; j ++){
                    	if (arr[j] != temp && arr[j] != temp2) {
                        	hum += arr[j];
                          	break;
                        }
                    }
                }
            }
          	else {
            	hum += comp.charAt(i);
            }
        }
      System.out.println(ans);
    }
}