public class Main{
	public static void main(String[] args) {
		Scanner sdf = new Scanner(System.in);
                int t=1;
                while(t-->0){
                    int n=sdf.nextInt();
                    int k=sdf.nextInt();
                    if(n>1){
                    System.out.println((int)Math.ceil(Math.log(n)/Math.log(k)));
                    }
                    else System.out.println("1");
                }                
        }
}
