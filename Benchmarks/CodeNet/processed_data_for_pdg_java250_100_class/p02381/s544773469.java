public class Main{
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		while (true){
			int num;
			double sum = 0;
			double ave;
			double bunsan = 0;
			num = sc.nextInt();
			if (num == 0){
				break;
			}
			double[] datas = new double[num];
			for (int i = 0; i < num;i++){
				double temp = sc.nextDouble();
				sum += temp;
				datas[i] = temp;
			}
			ave = sum / num;
			for (int i = 0; i < num; i++){
				bunsan += Math.pow((datas[i] - ave), 2);
			}
			bunsan /= num;
			System.out.printf("%f\n",Math.sqrt(bunsan));
		}
	}
}
