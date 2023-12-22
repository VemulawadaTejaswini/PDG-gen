import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] info=sc.nextLine().split(" ");
		int n=Integer.parseInt(info[0]);
		int k=Integer.parseInt(info[1]);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		Long left=Arrays.asList(sb.toString().split("")).stream().filter(s->s.equals("L")).count();
		Long right=n-left;
		for(int i=0;i<k;i++) {
			StringBuilder next=new StringBuilder();
			String target=sb.substring(0,1).equals("L")?"R":"L";
			next.append(sb.substring(0, sb.indexOf(target)));
			Integer nextIndex=Integer.min(sb.lastIndexOf(target)+1,sb.length());
			next.append(flip(sb.substring(sb.indexOf(target),nextIndex)));
			next.append(sb.substring(nextIndex));
			left=Arrays.asList(sb.toString().split("")).stream().filter(s->s.equals("L")).count();
			right=n-left;
			sb=new StringBuilder(next);
		}
		System.out.println(Long.max(left, right));
	}
}