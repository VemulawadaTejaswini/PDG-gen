public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(bis);
	    int data;
	    for(int i =1;;i++){data=sc.nextInt();
	      if(data!=0){
	    	System.out.println("Case "+i+": "+data);
	    }else{break;}}
	}
}
