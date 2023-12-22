import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //コンソールから入れる際に高速に入れる方法

        String strArr = br.readLine();
        int a = Integer.parseInt(strArr);
        if (a % 2 == 1) {
        	int x = (a/2) + 1;
            System.out.println(x);
        } else {
        	System.out.println(a/2);
        }

    }
}