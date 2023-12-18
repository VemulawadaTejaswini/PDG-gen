public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strARY[] = str.split(" ");
		int a = Integer.parseInt(strARY[0]);
		int b = Integer.parseInt(strARY[1]);
		int c = Integer.parseInt(strARY[2]);
		int x = 0;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(a);
		ary.add(b);
		ary.add(c);
		Collections.sort(ary);
		System.out.println(ary.get(0) + " " + ary.get(1) + " " + ary.get(2));
	}
}
