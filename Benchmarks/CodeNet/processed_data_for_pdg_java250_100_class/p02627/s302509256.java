public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);;
      	int ascii;
      	ascii = (int)c;
        if(ascii>=65 && 90>=ascii) 
          System.out.println("A");
      	else 
          System.out.println("a");
	}
}
