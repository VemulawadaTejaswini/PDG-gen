class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> NN = new ArrayList<Integer>();
		ArrayList<Integer> XX = new ArrayList<Integer>();
		int n=1;
		int x=1;
		int kumi =0;
		while(n != 0 || x!= 0){
			n =scan.nextInt();
			x =scan.nextInt();
			NN.add(n);
			XX.add(x);
		}
		for (int i=0;i<NN.size()-1;i++){
				kumi = 0;
			for(int i1=0;i1<NN.get(i);i1++){
				for(int i2=0;i2<NN.get(i);i2++){
					for(int i3=0;i3<NN.get(i);i3++){
						int N1 = i1+1;
						int N2 = i2+1;
						int N3 = i3+1;
						if( N1 == N2 || N2 == N3 || N3 == N1){
						}
						else{
							if(N1+N2+N3 == XX.get(i)){
								kumi += 1;
							}
						}
					}
				}
			}
			System.out.println(kumi/6);
		}
	}
}
