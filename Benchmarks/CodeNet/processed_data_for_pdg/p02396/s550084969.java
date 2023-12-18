public class Main{
public static void main(String[] args){
	int i=1;
	int x;
	Scanner input = new Scanner(System.in);
 while(true){
				x=input.nextInt();
					if(x==0){
						break;
					}
					System.out.println("Case "+i+": "+x);
					i++;
				}
}
}
