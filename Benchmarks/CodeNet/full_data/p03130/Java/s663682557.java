import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		Map<String,String> pMap = new HashMap<String,String>();
      	List<String> cList = new ArrayList<String>
          (Arrays.asList("1","2","3","4"));
      	boolean con = true;
      	boolean con2 = true;
      	String stack1;
      	String stack2;
      	String c;
      
      	for(int i = 0;i < 3;i++){
          	stack1 = sc.next();
          	stack2 = sc.next();
        	pMap.put(stack1,stack2);
          	pMap.put(stack2,stack1);
        }
      
      	for(int i = 1;i <= 4 && con;i++){
          	cList = new ArrayList<String>
          		(Arrays.asList("1","2","3","4"));
          	c = String.valueOf(i);
          	cList.remove(c);
          	con2 = true;
        	for(int j = 0; j < 3 && con2;j++){
            	if(pMap.containsKey(c)){
                	c = pMap.get(c);
                  	cList.remove(c);
                } else con2 = false;
            }
          	if(con2) con = false;
        }
      	
      	if(!con) System.out.println("YES");
      	else System.out.println("NO");
        
	}
}
