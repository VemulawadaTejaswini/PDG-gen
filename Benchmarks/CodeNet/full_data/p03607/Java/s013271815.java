import java.util.*;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();  
    
    List<Integer> list = new ArrayList<Integer>();
    
    for (int i = 0 ; i < n ; i++) {
    	int num = scan.nextInt();
    	if (list.indexOf(num) == -1) {
    		list.add(num);
    	} else {
    		list.remove(list.indexOf(num));
    	} 
    }
	System.out.println(list.size());
	return;
  }  
}
