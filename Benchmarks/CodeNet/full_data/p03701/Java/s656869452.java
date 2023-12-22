public class C_Bugged {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<Integer>();


		while (sn.hasNextLine()) {
		    String str = sn.nextLine();
		    inputList.add(Integer.parseInt(str));
		}

		int num = inputList.get(0);
		List<Integer> pointList = inputList.subList(1, inputList.size());
		int sum = 0;


		//sum all points
		for(int point: pointList){
			sum += point;
		}

		if(sum % 10 == 0){
			int min = calcMinNumber(inputList);

			if(min == -1){
				sum = 0;
			}else{
				sum -= min;
			}
		}

		System.out.println(sum);
	}


	private static int calcMinNumber(List<Integer> list){
		int min = -1;

		for(int elem : list){
			if((elem < min) && (elem % 10 != 0)){
				min = elem;
			}
		}

		return min;
	}

}