class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			String clock = sc.nextLine();
			String target = sc.nextLine();
			int pointer = 0;
			boolean result = false;
			for (int i=0; i<clock.length(); i++) {
				String s = "";
				pointer = i;
				for (int j=0; j<target.length(); j++) {
					s += clock.substring(pointer,pointer+1);
					pointer++;
					if (pointer==clock.length()) pointer = 0; 
				}
				if (s.equals(target)) {  
					result = true;
					break;
				}
			}
			if (result) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
