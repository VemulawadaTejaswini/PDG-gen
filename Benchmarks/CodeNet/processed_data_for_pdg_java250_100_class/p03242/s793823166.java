public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     String nyu=sc.nextLine();
nyu=nyu.replaceAll("1","e");
nyu=nyu.replaceAll("9","g");
nyu=nyu.replaceAll("e","9");
nyu=nyu.replaceAll("g","1");
System.out.println(nyu) ;
	}
}
