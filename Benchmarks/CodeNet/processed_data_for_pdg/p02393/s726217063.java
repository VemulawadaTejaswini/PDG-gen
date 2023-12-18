public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab=reader.readLine().split(" ");
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<3;i++){
        	nums.add(Integer.parseInt(ab[i]));
        }
        Collections.sort(nums);
        for(int i=0;i<3;i++){
        	System.out.print(nums.get(i));
        	if(i!=2){
        		System.out.print(" ");
        	}
        }
    	System.out.println();
	}
}
