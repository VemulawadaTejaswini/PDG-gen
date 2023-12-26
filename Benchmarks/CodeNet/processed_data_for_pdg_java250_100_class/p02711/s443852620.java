class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); 
    if (x % 10 == 7){
      System.out.println("Yes");
    }
    else if ((x/10)%10 == 7){
      System.out.println("Yes");
    }
    else if ((x/100) == 7){      
    	System.out.println("Yes");
    }
    else{
    System.out.println("No");}
  }
}
