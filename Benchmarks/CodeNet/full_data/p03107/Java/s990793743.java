import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s=new StringBuilder();
		int count=0;
		s.append(sc.next());
		while(true) {
			boolean flag=true;
			for(int i=0;i<s.length()-1;i++) {
				if(!s.substring(i, i+1).equals(s.substring(i+1, i+2))) {
					count++;
					s.delete(i, i+2);
					flag=false;
					break;
				}
			}
			if(flag)break;
		}
		System.out.println(count*2);
	}
}

