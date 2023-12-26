public class Main {
	public static void main(String args[]) {
	Scanner std = new Scanner(System.in);
	List<Integer> list = new ArrayList<>();
	int N = std.nextInt();
	int X = std.nextInt();
	int count = 1; 
	int zahyo = 0; 
	for(int i = 0; i < N; i++) {
		int L = std.nextInt();
		list.add(L);
	}
	for(int i = 0; i < N; i++) {
		zahyo += list.get(i);
		if(count > N+1 || zahyo > X) {
			break;
		}
		count++;
	}
		System.out.println(count);
	}
	}
