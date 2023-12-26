public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		int K = sc.nextInt(); 
		int sum = 0; 
		String flag = null;
		if(A >= K) { 
			flag = "A";
		}else if(A + B >= K) { 
			flag = "B";
		}else if (A + B + C >= K) { 
			flag = "C";
		}else { 
			sum = 0;
		}
		switch(flag) {
		case "A":
			sum = K;
			break;
		case "B":
			sum = A;
			break;
		case "C":
			sum = A - (K - A - B);
		}
		System.out.print(sum);
	}
}
