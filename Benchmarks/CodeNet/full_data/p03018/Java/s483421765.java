import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		
		boolean firstflag;
		
		int sum = 0, nextFirst = 0;
		while(true) {
			int count = 0;
			firstflag = true;
			for(int i = 0; i < str.length; i++) {
				if(i >= str.length-2) break;
				if(str[i].equals("A") && str[i+1].equals("B") && str[i+2].equals("C")) {
					if(firstflag && i != 0) nextFirst = i - 1;
					//System.out.println(i);
					str[i] = "B";
					str[i+1] = "C";
					str[i+2] = "A";
					i = i +2;
					count++;
					firstflag = false;
				}
			}
			if(count==0) break;
			String[] temp = new String[str.length - nextFirst];
			System.arraycopy(str, nextFirst, temp, 0, str.length - nextFirst);
			str = temp;
			//System.out.println(String.join("", temp));
			
			sum+=count;
		}
		//System.out.println(String.join("", str));
		System.out.println(sum);
	}
}