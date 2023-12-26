class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double area = 0.f;
		double sum;
		double sta;
		double dev;
		double dev_w;
		double dev_sum;
		double ave;
		double var;
		boolean Judge = true;
		while(Judge){
			int  stu_num = scanner.nextInt();	
			if( stu_num == 0 ){
				break;
			}
			double stu[] = new double[stu_num];
			sum = 0;
			dev_sum = 0;
			dev_w = 0;
			for( int i = 0; i < stu_num ; i ++ ){
				stu[i] = scanner.nextDouble();
				sum += stu[i];
			}
			ave = sum / stu_num;		
			for( int i = 0; i < stu_num ; i ++ ){
				dev = ave - stu[i];
				dev_w = dev * dev;
				dev_sum += dev_w;
			}
			if(dev_sum != 0) {
				var = dev_sum / stu_num;		
			}else {
				var = 0;
			}
			sta = Math.sqrt(var);
			System.out.println(sta);
		}
		scanner.close();
	}
}
