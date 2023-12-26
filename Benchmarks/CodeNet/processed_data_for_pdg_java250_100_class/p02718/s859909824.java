public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array=new ArrayList<>();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<N;i++) {
			array.add(sc.nextInt());
			sum+=array.get(i);
		}
		BigDecimal a=BigDecimal.valueOf(1);
		BigDecimal b=BigDecimal.valueOf(4*M);
		BigDecimal result=a.divide(b,4,RoundingMode.HALF_UP);
		BigDecimal sumBigDecimal=BigDecimal.valueOf(sum);
		BigDecimal get=result.multiply(sumBigDecimal);
		int get1=get.intValue();
		for(int entity:array) {
			if(entity>get1){
				count++;
			}
		}
		if(count>=M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
