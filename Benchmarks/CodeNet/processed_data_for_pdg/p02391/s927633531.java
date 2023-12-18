class Main{
    public static void main(String[] args){
        String[] x = null;
        Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		x = ip.split(" ", 0);
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		if(a<b){
		    System.out.println("a < b");
		}else if(a>b){
		    System.out.println("a > b");
		}else{
		    System.out.println("a == b");
		}
    }
}
