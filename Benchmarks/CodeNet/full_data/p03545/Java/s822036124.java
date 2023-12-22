import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char[] c = s.toCharArray();
		int[] num = new int[c.length];
		for(int i=0;i<c.length;i++){
			num[i] = Character.getNumericValue(c[i]);
		}
		for(int i=0;i<8;i++){
			String bin = Integer.toBinaryString(i);
			int sum = num[0];
			if(bin.length() == 1){
				bin = "00" + bin;
			}else if(bin.length() == 2){
				bin = "0" + bin;
			}
			char[] cstr = bin.toCharArray();
			for(int j=0;j<3;j++){
				if(cstr[j]== '0'){
					cstr[j] = '+';
					sum += num[j+1];
				}else{
					cstr[j] = '-';
					sum -= num[j+1];
				}
			}
			if(sum == 7){
				System.out.println(String.valueOf(num[0]) + cstr[0] + String.valueOf(num[1]) + cstr[1] + String.valueOf(num[2]) + cstr[2] + String.valueOf(num[3]) + "=7");
				return ;
			}
		}

	}

}

class Combination {
	char a;
	char b;
	char c;

	public char getA(){
		return a;
	}

	public void setA(char a){
		this.a = a;
	}

	public char getB(){
		return b;
	}

	public void setB(char b){
		this.b = b;
	}

	public char getC(){
		return c;
	}

	public void setC(char c){
		this.c = c;
	}
}
