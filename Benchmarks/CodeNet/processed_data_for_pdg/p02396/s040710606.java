class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<Integer>();
        while(true) {
        	int read = sc.nextInt();
        	if(read==0) {
        		break;
        	}
        	data.add(read);
        }
        for(int i=1;i<=data.size();i++) {
        	System.out.println("Case "+i+": "+data.get(i-1));
        }
    }
}
