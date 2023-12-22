
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

	int N = MyScanner.nextInt();
	int K = MyScanner.nextInt();

	List<MyClass> list = new ArrayList<MyClass>(N);

	for (int i = 0; i < N; i++) {
	    int a = MyScanner.nextInt();
	    int b = MyScanner.nextInt();

	    list.add(new MyClass(a, b));
	}
	Collections.sort(list);

	int num = 0;
	for(MyClass l: list) {
	    num += l.b;
	    if(num >= K) {
		System.out.println(l.a);
		break;
	    }
	}
	scan.close();
    }
}

class MyScanner {

    private static int index = 0;
    private static String[] word = new String[0];
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int nextInt() {
	if(index >= word.length) {
	    index = 0;
	    try {
		word = br.readLine().split("[\\s]+");
	    } catch(IOException e) {
		e.printStackTrace();
	    }
	}
	return Integer.parseInt(word[index++]);
    }
}

class MyClass implements Comparable<MyClass> {

    int a;
    int b;

    MyClass(int a, int b) {
	this.a = a;
	this.b = b;
    }

    @Override
    public int compareTo(MyClass o) {
	return a - o.a;
    }
}
