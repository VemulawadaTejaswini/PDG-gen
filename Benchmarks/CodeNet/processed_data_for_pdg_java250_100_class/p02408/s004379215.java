class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> suite = new ArrayList<String>();
		ArrayList<String> hikaku = new ArrayList<String>();
		int n =scan.nextInt();
		for(int ii=0;ii<n;ii++){
			String x = scan.next();
			String y = scan.next();
			String xy =x+" "+y;
			suite.add(xy);
		}
		for(int na=1;na<14;na++){
			hikaku.add("S "+na);
		}
		for(int na=1;na<14;na++){
			hikaku.add("H "+na);
		}
		for(int na=1;na<14;na++){
			hikaku.add("C "+na);
		}
		for(int na=1;na<14;na++){
			hikaku.add("D "+na);
		}
		int atta =0;
		for(int i=0;i<hikaku.size();i++){
			atta = 0;
			for(int ii=0;ii<suite.size();ii++){
				String hk = hikaku.get(i);
				String su = suite.get(ii);
				if(hk.equals(su)){
					atta =1;
					break;
				}
				else{
					atta =0;
				}
			}
			if(atta == 0){
				System.out.println(hikaku.get(i));
			}
		}
	}
}
