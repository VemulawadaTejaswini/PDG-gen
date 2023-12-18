class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] hoge = new int[3];
        int tmp;
        hoge[0] = a;
        hoge[1] = b;
        hoge[2] = c;
        if(hoge[1] > hoge[2]){
        	tmp = hoge[1];
        	hoge[1] = hoge[2];
        	hoge[2] = tmp;
        }
        if (hoge[0] > hoge[1]) {
        	tmp = hoge[0];
        	hoge[0] = hoge[1];
        	hoge[1] = tmp;
        }
        if(hoge[1] > hoge[2]){
        	tmp = hoge[1];
        	hoge[1] = hoge[2];
        	hoge[2] = tmp;
        }
        System.out.printf("%d %d %d\n", hoge[0], hoge[1], hoge[2]);
	}
}
