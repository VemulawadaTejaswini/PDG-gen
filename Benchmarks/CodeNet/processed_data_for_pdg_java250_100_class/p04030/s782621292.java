public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputs = input.split("");
		List<String> line = new ArrayList<String>();
		for(String c : inputs){
			if(c.equals("0") || c.equals("1")){
				line.add(c);
			}else{
				if(!line.isEmpty()){
					line.remove(line.size()-1);
				}
			}
		}
		System.out.println(String.join("", line));
	}
}
