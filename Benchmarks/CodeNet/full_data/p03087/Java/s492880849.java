import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
        List<Integer> ac=new ArrayList<Integer>();
        for(int i=0;n>i;i++) {
        	if(list.get(i).equals("A")) {
        		if(list.get(i+1).equals("C"))
        			ac.add(i);
        	}
        }
        List<Integer> answer = new ArrayList<Integer>();
        for(int i=0;q>i;i++) {
        	int a = sc.nextInt()-1;
        	int b = sc.nextInt()-1;
        	int count=0;
        	for(int j=a;b>j;j++) {
        		if(ac.contains(j))
        			count++;
        	}
        	answer.add(count);
        }
        for(int i=0;q>i;i++) {
        	System.out.println(answer.get(i));
        }
        //System.out.println(answer);

	}
}