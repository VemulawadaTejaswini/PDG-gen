import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //コンソールから入れる際に高速に入れる方法

        
        String strArr[] = br.readLine().split(" ");
      	 
        String temp = strArr[1]; 
      	strArr[1] = strArr[0];
      	strArr[0] = strArr[2];
      	strArr[2] = temp;
          System.out.println(strArr[0] + " " + strArr[1] + " " + strArr[2]);
    }
}