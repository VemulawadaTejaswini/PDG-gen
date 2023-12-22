public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
		long sum = 0;
		String line = sc.nextLine();
		if(line.length()==1){
			if(Integer.parseInt(line)==0){
				break;
				}
			}
			for(int i=0;i<line.length();i++){
				sum += Integer.parseInt(String.valueOf(line.charAt(i)));
			}
			System.out.println(sum);
		}
	}
}
