public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		int[] d = new int[a];
		int[] e = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
          d[i] --;
			e[d[i]] = i + 1;
		} 
		for(int i = 0; i < a; i++){
			System.out.print(e[i] + " ");
		}
	}
}
