import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {//注意while处理多个case
        	int N = in.nextInt();
        	String tmp = in.nextLine();
        	String[] answers = new String[N];
        	HashMap<String, Integer> answerIndex = new HashMap<>();
        	for (int i = 0; i < N; i++) {
				answers[i] = in.nextLine();
				answerIndex.put(answers[i], i+1);
			}
        	
        	int q = in.nextInt();
        	tmp = in.nextLine();
        	String[] querys = new String[q];
        	for(int i = 0; i < q; i++){
        		querys[i] = in.nextLine();
        		String[] change = querys[i].split(" ");
        		int index = Integer.valueOf(change[0]);
        		String queryNow = change[1];
        		int[] shunxu = new int[26];
        		for(int j = 0; j < queryNow.length(); j++){
        			shunxu[queryNow.charAt(j)-'a'] = j;
        		}
        		for(int k = 0; k < answers.length-1; k++){
        			for (int l = k+1; l < shunxu.length; l++) {
						int flag = 0;
        				int minlen = Math.min(answers[k].length(), answers[l].length());
						for(int tmpindex = 0; tmpindex < minlen; tmpindex++){
							if (shunxu[answers[k].charAt(tmpindex)-'A'] > shunxu[answers[l].charAt(tmpindex)-'A']) {
								flag = 1;
								break;
							}
						}
						if (flag == 0 && answers[k].length() > answers[l].length()) {
							flag = 1;
						}
						if (flag == 1) {
							String tmpstore = answers[k];
							answers[k] = answers[l];
							answers[l] = tmpstore;
						}
					}
        		}
        		
        		System.out.println(answerIndex.get(answers[index]));
        	}
        	
        }
        in.close();
    }
}