class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int sec = 0;
		int[] time=new int[3];
		str = br.readLine();
		sec = Integer.parseInt(str);
		for(int i=0; i<3; i++){
			time[i]=sec%60;
			sec=sec/60;
		}
		System.out.println(time[2]+":"+time[1]+":"+time[0]);
	}
}
