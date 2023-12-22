import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();

		List<Integer> S = new ArrayList<Integer>();
		List<Integer> T = new ArrayList<Integer>();
		List<Integer> Key = new ArrayList<Integer>();


		boolean restorable = false;

		for(int i = 0;i<t.length();i++){
			T.add((int)t.charAt(i));
		}

		int question = 0;
		int insert = -1;	//T挿入番地

		boolean isNotQuestion = false;
		for(int i = 0;i<s.length();i++){
			int nowS = (int)s.charAt(i);
			S.add(nowS);

			//?...63
			if(nowS == 63){
				question++;
			}else if(question != 0){
				if(isNotQuestion && question == T.size()-1 && S.get(i-question-1) == T.get(0)){
					insert = i-question;
					System.out.println("ins 01");
				}else if(question >= T.size()){
					insert = i-question;
					System.out.println("ins 02");
				}
				question = 0;
			}else{
				isNotQuestion = true;
				question = 0;
			}
		}
		if(question != 0){
			if(question == T.size()-1 && S.get(s.length()-1-question) == T.get(0)){
				insert = s.length()-1-question;
				System.out.println("ins 01");
			}else if(question >= T.size()){
				insert = s.length() - 1 - question;
				System.out.println("ins 02");
			}
		}

		if(insert == -1){
			System.out.println("UNRESTORABLE");
			System.exit(0);
		}

		for(int i = insert;i<Math.min(insert+T.size(),S.size());i++){
			S.set(i,T.get(i-insert));
		}

		for(int i = 0;i<S.size();i++){
			if(S.get(i) == 63)S.set(i,97);
		}

		byte[] ascii = new byte[S.size()];

		for(int i = 0;i<S.size();i++){
			ascii[i] = Byte.parseByte(String.valueOf(S.get(i)));
		}


		String resultString;
	    try {
	    	resultString = new String(ascii, "US-ASCII");
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	return;
	        }

		System.out.println(resultString);
		//TODO:全部aに置き換える








	}

}
