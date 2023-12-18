class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String hoge;
        if (a < b) {
        	hoge = "a < b";
        }
        else if (a > b) {
        	hoge = "a > b";
        }
        else {
        	hoge = "a == b";
        }
        System.out.println(hoge);
	}
}
