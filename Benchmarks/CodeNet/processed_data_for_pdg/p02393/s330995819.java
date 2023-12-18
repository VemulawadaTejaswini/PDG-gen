public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] array = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		int[] num = {a,b,c};
		for(int i = 0;i<num.length-1;i++){
			for(int j = num.length-1; j>i; j--){
				if(num[j]<num[j-1]){
					int copy = num[j-1];
					num[j-1] = num[j];
					num[j] = copy; 
				}
			}
		}
		System.out.println(num[0]+" "+num[1]+" "+num[2]);
	} 
}
