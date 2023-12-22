import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6/1コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String s = sc.next();
		String[] fruit = s.split("");
		String word=null;
		String word2=null;

        if(c<d) {
        	List<String> three=new ArrayList<String>();
        	for(int i =0;d-b>i;i++) {
        		three.add(fruit[b+i]);
        		word=word+three.get(i);
        		//System.out.println(word);
        	}
        	if(word.contains("..")) {
        		List<String> two=new ArrayList<String>();
            	for(int i =0;c-a>=i;i++) {
            		two.add(fruit[a+i]);
            		word2=word2+two.get(i);
            		//System.out.println(word);
            	}
            	if(word2.contains("..")) {
        		System.out.println("Yes");
            	}
            	else {
            		System.out.println("No");
            	}
        	}
        	else {
        		System.out.println("No");
        	}

        }
        else {
        	List<String> three=new ArrayList<String>();
        	for(int i =0;d-b-1>=i;i++) {
        		three.add(fruit[b+i]);
        		word=word+three.get(i);
        		//System.out.println(word);
        	}
        	if(word.contains("...")) {
        		System.out.println("Yes");
        	}
        	else {
        		System.out.println("No");
        	}

        }

	}

}
