public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = 3;
		int list[] = new int[num];
		for(int i =0; i < num; i++){
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		for(int i = 0; i < num; i++){
			if(i == num - 1){
				System.out.println(list[i]);
			}else{
				System.out.print(list[i] + " ");
			}
		}
	}
}
