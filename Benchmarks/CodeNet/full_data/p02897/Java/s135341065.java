public class Main{
    public static void main(String[] args) {
	int a = 1 + new java.util.Random().nextInt(100);
	int cnt = 0;
	double out;
	System.out.println("入力例:" + a);

	for(int i = a; i >= 1; i--) {
	    if(i % 2 != 0) {
		cnt++;
	
	    }
	}


	out = (double)cnt / (double)a;
	System.out.println("出力例:" + out);
    }
}
