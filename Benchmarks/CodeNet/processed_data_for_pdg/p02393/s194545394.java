public class Main{
	public static void main(String[] args) {
		int[] n=new int[3];
		String s=null;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			s=br.readLine();
			StringTokenizer st=new StringTokenizer(s," ");
			for(int i=0;i<3;i++){
				n[i]=Integer.parseInt(st.nextToken());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		int temp;
		int minIndex;
		for(int i=0;i<3;i++){
			minIndex=i;
			for(int j=i;j<3;j++){
				if(n[j]<n[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex!=i){
				temp=n[i];
				n[i]=n[minIndex];
				n[minIndex]=temp;
			}
		}
		System.out.println(n[0] + " " + n[1] + " " + n[2]);
	}
}
