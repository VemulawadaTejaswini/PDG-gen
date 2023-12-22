import java.lang.reflect.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long Q = sc.nextInt();
		sc.nextLine();
		String S = sc.next();
		List<Question> qList = new ArrayList();
		for(int i=0; i<Q; i++){
			qList.add(new Question(sc.nextInt(), sc.nextInt()));
		}

		for(Question q : qList){
			int ans = 0;
			String qText = S.substring(q.l-1, q.r);
			while(true){
				int a = qText.indexOf("AC");
				if(qText.indexOf("AC") >= 0){
					ans++;
					qText = qText.replaceFirst("AC", "");
				} else{
					System.out.println(ans);
					break;
				}
			}


		}


	}

}

class Question {

	Question(int l, int r){
		this.l = l;
		this.r = r;
	}
	int l;
	int r;
}