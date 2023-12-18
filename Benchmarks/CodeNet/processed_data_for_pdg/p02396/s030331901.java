class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int i = 1;
        for(;;i++){
            int x = sc.nextInt();
            if(1<=x && x<=10000){
                System.out.println("Case "+i+": "+x);
            }else if(x==0){
                    break;
            }
        }
	}
}
