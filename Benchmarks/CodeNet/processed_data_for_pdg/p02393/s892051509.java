public class Main {
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int[] line=new int[4];
	for(int i=0;i<3;i++){
		line[0]=in.nextInt();
		for(int o=0;o<3;o++){
		if(line[o] > line[o+1]){
			int temp=line[o];
			line[o]=line[o+1];
			line[o+1]=temp;
		}
		}
	}
	System.out.println(line[1]+" "+line[2]+" "+line[3]);
	}
}
