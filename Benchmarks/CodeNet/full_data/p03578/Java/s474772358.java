import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ideaNum = sc.nextInt();
		List<Integer> ideas = new ArrayList<>();
		for(int i = 0; i < ideaNum; i++)ideas.add(sc.nextInt());
		Collections.sort(ideas);
		int needNum = sc.nextInt();
		List<Integer> needs = new ArrayList<>();
		for(int i = 0; i < needNum; i++)needs.add(sc.nextInt());
		Collections.sort(needs);
		String ans = "YES";

		for(int i : needs) {
			if(ideas.contains(i)) {
				ideas.remove((Integer)i);
			} else {
				ans = "NO";
				break;
			}
		}

		System.out.println(ans);
	}
}


