import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    String w = input.next();char ch ;
    int []counter=new int [26];
    for (int i = 0; i < w.length(); i++) {
		ch = w.charAt(i);
		counter[ch-'a']++;
	}
  String s = "Yes";
  for (int i = 0; i < counter.length; i++) {
	if (counter[i]%2!=0) {
		s="No";
	}
}	System.out.println(s);

}}