import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	int coursol = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int AnsMin = 0;
      
    	for( int i = 0 ; i < coursol ; i++){
 			list.add(sc.nextInt());
            }
  
			ArrayList<Integer> copy = (ArrayList<Integer>)(list.clone());
            copy.remove(i);
          	         
          	Collections.sort(copy, Collections.reverseOrder());
            System.out.println(copy.get(0));
            }
       }
}
