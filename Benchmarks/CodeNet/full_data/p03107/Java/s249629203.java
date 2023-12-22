import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

    	try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){

    		String S = r.readLine();
    		List<Boolean> cs = S.chars().mapToObj(s -> s=='1').collect(Collectors.toCollection(LinkedList::new));

    		int cnt = 0;
    		int st = 0;
    		boolean done;
    		while(true) {
    			done = false;
    			for(int i=st; i < cs.size(); i++) {
    				try {
    					if(cs.get(i) != cs.get(i+1)) {
    						cnt++;
    						st=i==0?0:i-1;
    						done = true;
    						cs.remove(i);
    						cs.remove(i);
    						break;
    					}
    				}catch(Exception e) {
    					break;
    				}
    			}
    			if(!done)break;
    		}

	    	System.out.println(cnt*2);
    	}
    }
}