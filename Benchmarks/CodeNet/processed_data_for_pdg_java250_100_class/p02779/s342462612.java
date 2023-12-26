public class Main {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		for(int i =0;i<N;i++) {
			str[i]=sc.next();
		}
	     List<String> listA = new ArrayList<String>(Arrays.asList(str));
	     List<String> listB = new ArrayList<String>(new HashSet<>(listA));
	    if(listA.size()==listB.size()) {
	    	System.out.println("YES");
	    }else {
	    	System.out.println("NO");
	    }
	}
}
