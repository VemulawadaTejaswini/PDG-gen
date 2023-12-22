import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
		HashMap<String,Integer>string_num=new HashMap<String,Integer>();
		ArrayList<String>max_words=new ArrayList<String>();
		String S = null;
		
	    for(int i=0;i<N;i++) {
		    S = scanner.next();
	    	if(string_num.get(S)==null) {
	    		string_num.put(S,1);
	    	}else {
	    		string_num.put(S,string_num.get(S)+1);
	    	}
	    }
	    
		int max_value=string_num.get(S);

		for(String key:string_num.keySet()){
			if(max_value<string_num.get(key)) {
				max_value=string_num.get(key);
				S=key;
			}
		}
		for(String key:string_num.keySet()){
			if(max_value==string_num.get(key)) {
				max_words.add(key);
			}
		}
	    
		int flag;
		do{
			flag=0;
			for(int i=0;i<max_words.size()-1;i++) {
				if(max_words.get(i).compareTo(max_words.get(i+1))>0) {
					String tmp=max_words.get(i);
					max_words.set(i,max_words.get(i+1));
					max_words.set(i+1,tmp);
					flag=1;
				}
			}
		}while(flag==1);
		
	    for(int i=0;i<max_words.size();i++) {
	    	System.out.println(max_words.get(i));
	    }
  		scanner.close();
	}

}