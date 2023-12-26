public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x,y;
		List<Integer> list = new ArrayList<Integer>();
		boolean flg1,flg2;
		flg1 =false;
		flg2 = false;
		while(true){
			x = scan.nextInt();
			y = scan.nextInt();
			if (x == 0){flg1= true;}
			if (y == 0){flg2 = true;}
			if ((flg1 == true) & (flg2 == true)){break;}
			list.add(x);
			list.add(y);
			Collections.sort(list);
			sb.append(list.get(0));
			sb.append(" ");
			sb.append(list.get(1));
			sb.append("\n");
			list.clear();
			flg1 = false;
			flg2 = false;
		}
		System.out.print(new String(sb));
	}
}
