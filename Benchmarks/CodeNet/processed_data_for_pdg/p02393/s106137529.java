public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num_ary=new int[3];
		for(int i=0;i<3;i++){
			num_ary[i]=sc.nextInt();
		}
		Arrays.sort(num_ary);
		System.out.println(num_ary[0]+" "+num_ary[1]+" "+num_ary[2]);
	}
}
