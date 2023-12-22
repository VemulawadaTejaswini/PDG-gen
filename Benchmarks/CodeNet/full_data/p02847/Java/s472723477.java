import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if(s.charAt(1) == 'O'){
                System.out.println(6);
            }
            else if(s.charAt(1) == 'E'){
                System.out.println(4);
            }
            else if(s.charAt(1) == 'H'){
                System.out.println(3);
            }
            else if(s.charAt(1) == 'R'){
                System.out.println(2);
            }
            else if(s.charAt(1) == 'A'){
                System.out.println(1);
            }
            else if(s.charAt(0) == 'S'){
                System.out.println(7);
            }
            else if(s.charAt(0) == 'T'){
                System.out.println(5);
            }
	}
}
