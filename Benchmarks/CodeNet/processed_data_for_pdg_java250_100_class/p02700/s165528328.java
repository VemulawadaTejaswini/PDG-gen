public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tA = scan.nextInt();
		int tB = scan.nextInt();
		int aC = scan.nextInt();
		int aD = scan.nextInt();
		String ans = "Yes";
		while(tA>0 && aC>0){
          aC = aC - tB;
          if(aC <= 0){
            ans="Yes";
            break;
          }
          tA = tA - aD;
          if(tA <= 0){
            ans = "No";
            break;
          }
        }
        System.out.println(ans);
    }
}
