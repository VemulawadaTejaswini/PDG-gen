import java.util.Scanner;
import java.nio.ByteBuffer;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long numA = in.nextLong();
		long numB = in.nextLong();
		
		byte[] bytesA = ByteBuffer.allocate(8).putLong(numA).array();
		byte[] bytesB = ByteBuffer.allocate(8).putLong(numB).array();

		byte[] bytesC = new byte[bytesA.length];
		
		for(int i = 0; i < bytesA.length; i++){
			bytesC[i] = (byte) (bytesA[i] ^ bytesB[i]); 
		}
		System.out.println(ByteBuffer.wrap(bytesC).getLong());
		
		in.close();
	}
	
}