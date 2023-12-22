import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        String ans = "NO";
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == 'k'){
            	count++;
            }else if(count == 1 && s.charAt(i) == 'e'){
            	count++;
            }else if(count == 2 && s.charAt(i) == 'y'){
            	count++;
            }else if(count == 3 && s.charAt(i) == 'e'){
            	count++;
            }else if(count == 4 && s.charAt(i) == 'n'){
            	count++;
            }else if(count == 5 && s.charAt(i) == 'c'){
            	count++;
            }else if(count == 6 && s.charAt(i) == 'e'){
            	ans = "YES";
            }
        }
        System.out.println(ans);
    }
}