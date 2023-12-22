import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next(),t="";
		int count=0,max=0;
		for(int i=0;i<s.length();i++) {
			if(i%2==0)t+="0";
			else t+="1";
			if(!s.substring(i, i+1).equals(t.substring(i, i+1)))count++;
		}
		t="";
		max=count;
		count=0;
		for(int i=0;i<s.length();i++) {
			if(i%2==0)t+="1";
			else t+="0";
			if(!s.substring(i, i+1).equals(t.substring(i, i+1)))count++;
		}
		System.out.println((int)Math.min(max, count));
	}
}

