import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Character[] s = sc.next().toCharArray();
        Character[] t = sc.next().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t,Comparator.reverseOrder());
        String sort_s = String.valueOf(s);
        String sort_t = String.valueOf(t);

        if(sort_s.compareTo(sort_t) < 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    
}