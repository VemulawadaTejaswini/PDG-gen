import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
            Collections.reverse(list);
        }
        String list1 = list.toString().replace(",","").replace("[","").replace("]","");
        System.out.println(list1);
    }
}