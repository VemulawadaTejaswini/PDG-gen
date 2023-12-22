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

		List<Integer> acList = new ArrayList<>();
		while(true){
			int acIndex = S.indexOf("AC");
			if(acIndex >= 0){
				if(acList.size()>0){
					acList.add(acIndex + acList.get(acList.size()-1)+2);
				}else{
					acList.add(acIndex);
				}

				S = S.substring(S.indexOf("AC")+2);
			} else{
				break;
			}
		}

		for(Question q : qList){
			int ans = 0;
			for(int indx : acList){
				if(q.l-1 <= indx && q.r-1 >= indx+1){
					ans++;
				}
			}
			System.out.println(ans);
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