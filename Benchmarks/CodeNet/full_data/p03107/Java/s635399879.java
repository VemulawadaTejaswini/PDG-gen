import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

    	try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){

    		String S = r.readLine();
    		List<Character> chars = S.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

	    	int cnt = 0;
	    	boolean done = false;

	    	while(true) {
	    		done = false;
	    		for(int i=0; i < chars.size(); i++) {
	    			try {
		    			if(!chars.get(i).equals(chars.get(i+1))) {
		    				cnt+=2;
		    				done = true;
		    				chars.remove(i);
		    				chars.remove(i);
		    				break;
		    			}
	    			} catch(Exception e) {
	    				break;
		    		}
	    		}

	    		if(!done)break;
	    	}

	    	System.out.println(cnt);
    	}
    }
}