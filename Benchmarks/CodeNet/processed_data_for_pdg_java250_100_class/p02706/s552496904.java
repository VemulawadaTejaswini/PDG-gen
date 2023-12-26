class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
      int a = input.nextInt();
      int b =input.nextInt();
      for(int i =0; i<b; i++){
        	int c = input.nextInt();
      		a = a-c;
      }
      if(a<0){
        System.out.println ("-1");
      }
      else{
        System.out.println(a);
      }
    }
}
