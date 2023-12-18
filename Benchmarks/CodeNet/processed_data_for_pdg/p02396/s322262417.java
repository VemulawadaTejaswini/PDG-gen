public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		int tmp;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		tmp = sc.nextInt();
		x.add(tmp);
		cnt++;
		while(tmp!=0){
			sc.hasNext();
			tmp = sc.nextInt();
			x.add(tmp);
			cnt++;
		}
		for(int i=0;i<cnt-1;i++){
			System.out.println("Case "+ (i+1) +": "+ x.get(i));
		}
		sc.close();
	}
}
