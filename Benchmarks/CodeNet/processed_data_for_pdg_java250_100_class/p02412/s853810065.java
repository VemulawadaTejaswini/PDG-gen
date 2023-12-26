public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x == 0) break;
			int count = 0;
			ArrayList<ArrayList<Integer>> duplications = new ArrayList<>();
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(j==i) continue;
					for(int y=1; y<=n; y++) {
						if(y == j || y == i) continue;
						if((i+j+y) == x) {
							Boolean breakFlag = false;
							for(ArrayList<Integer> dup : duplications) {
								if(dup.indexOf(i) != -1 && dup.indexOf(j) != -1 && dup.indexOf(y) != -1) {
									breakFlag = true;
									break;
								}
								if(breakFlag) break;
							}
							if(!breakFlag) {
								count++;
								ArrayList<Integer> dup = new ArrayList<>();
								dup.add(i);
								dup.add(j);
								dup.add(y);
								duplications.add(dup);
							}
						}
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
