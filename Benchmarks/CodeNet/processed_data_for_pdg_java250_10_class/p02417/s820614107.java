public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = "";
		while(sc.hasNext()){
		    String line = sc.nextLine();
		    lines += line;
		}
		lines = lines.toLowerCase().replace(" ","");
		char []array_str = lines.toCharArray();
		for (char lit = 'a'; lit <= 'z'; lit++){
		    int count = 0;
		    for (char c: array_str){
		        if (lit == c){
		            count++;
		        }
		    }
		    System.out.println(lit+" : "+count);
		} 
	}
}
