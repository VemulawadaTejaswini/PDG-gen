public class Main {
	public static void main(String[] args) {
		List<Integer> n=new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		while(true){
			int s = scan.nextInt();
			if(s==0){
				break;
			}
			else{
				n.add(s);
			}
		}
		for(int i=0;i<n.size();i++){
			System.out.println("Case " + (i+1) +": "+n.get(i));
		}
	}
}
