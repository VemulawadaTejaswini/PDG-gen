public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder bu = new StringBuilder();
		int h,w;
		while((h=sc.nextInt())!=0&&(w=sc.nextInt())!=0){
			for(int i=0;i<h;i++){
				for(int o=0;o<w;o++){
					bu.append("#");
				}
				bu.append("\n");
			}
			bu.append("\n");
		}
		System.out.print(bu);
	}
}
