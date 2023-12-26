public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] spl = s.split("");
		String ss = spl[0];
		if(spl[1].equals(ss)){
			if(spl[2].equals(ss)){
				System.out.println("No");
				return;
			}else{
				if(spl[3].equals(ss)){
					System.out.println("No");
					return;
				}else{
					if(spl[2].equals(spl[3])){
						System.out.println("Yes");
						return;
					}else{
						System.out.println("No");
						return;
					}
				}
			}
		}else{
			if(spl[2].equals(ss)){
				if(spl[1].equals(spl[3])){
					System.out.println("Yes");
					return;
				}else{
					System.out.println("No");
					return;
				}
			}else if(spl[2].equals(spl[1])){
				if(spl[3].equals(ss)){
					System.out.println("Yes");
					return;
				}else{
					System.out.println("No");
					return;
				}
			}else{
				System.out.println("No");
				return;
			}
		}
	}
}
