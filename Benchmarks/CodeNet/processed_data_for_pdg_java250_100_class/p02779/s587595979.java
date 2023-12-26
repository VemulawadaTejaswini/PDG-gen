public class Main {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
            List<Integer> listA = new ArrayList<Integer>();
            for(int i=0; i<num; i++){
                listA.add(new Integer(scan.nextInt()));
            }
	        scan.close();
	        List<Integer> listB = new ArrayList<Integer>(new HashSet<>(listA));
	        if(listA.size() != listB.size()) {
	        	System.out.println("NO");
	        }else {
	            System.out.println("YES");
	        }
    }
}
