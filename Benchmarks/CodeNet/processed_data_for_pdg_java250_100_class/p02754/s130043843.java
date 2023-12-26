public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long blue = sc.nextLong();
		long red = sc.nextLong();
        long n = num/(blue+red);
        long amari=num%(blue+red);
      	if(amari - blue<=0){
         	 System.out.println(blue*n+amari);
        }else{
             System.out.println(blue*(n+1));
        } 
	}
}
