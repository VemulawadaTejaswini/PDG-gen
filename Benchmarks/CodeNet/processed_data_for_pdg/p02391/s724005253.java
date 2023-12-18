class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  x = scanner.nextInt();			
	  	int  y = scanner.nextInt();
	  	int J;
	  	if(x == y)			
	  		J = 1;
	  	else{
	  		if(x > y)
	  			J = 2;
	  		else
	  			J = 3;
	  	}
	  	switch(J){
	  	case 1:
	  		System.out.println("a == b");
	  		break;
	  	case 2:
	  		System.out.println("a > b");
	  		break;
	  	case 3:
	  		System.out.println("a < b");
	  	}
        scanner.close();
  }
}
