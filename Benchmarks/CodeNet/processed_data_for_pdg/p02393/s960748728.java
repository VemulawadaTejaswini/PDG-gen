class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
  	int a = scan.nextInt();
  	int b = scan.nextInt();
	int c = scan.nextInt();
  	int i = 0;
  	if(a > b){
  		i = a;
  		a = b;
  		b = i;
  	}
  	if(b > c){
  		i = b;
  		b = c;
  		c = i;
	}
  	if(a > b){
  		i = a;
  		a = b;
  		b = i;
 	}
  	  	System.out.println(a + " " + b + " " + c);
  }
}
