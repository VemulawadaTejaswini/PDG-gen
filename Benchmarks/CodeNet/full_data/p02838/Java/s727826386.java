import java.util.Scanner;

class BinaryConversion {
	public static long[] decimalToBinary(long num) {
		long[] a=new long[60];
		int i=a.length-1;
		while(num!=0) {
			a[i]=num%2;
			num/=2;
			i--;
		}
		return a;
	}
	public static long binaryToDecimal(long[] a) {
		long num=0;
		for (int i = 0; i < a.length; i++) {
			num+=(a[i]*Math.pow(2, a.length-1-i));
		}
		return num;
	}
}

class XOR {
	public static long[] xor(long num1,long num2) {
		long[] a=BinaryConversion.decimalToBinary(num1);
		long[] b=BinaryConversion.decimalToBinary(num2);
		for (int i = 0; i < a.length; i++) {
			a[i]=(a[i]+b[i])%2;
		}
		return a;
	}
}

class Add {
	public static long[] add(long[] a,long[] b) {
		long[] CI=new long[61];//进位
		for (int i = a.length-1; i >= 0; i--) {
			if(a[i]+b[i]+CI[i]>=2) {
				CI[i-1]=1;
			}
			a[i]=(a[i]+b[i]+CI[i])%2;
		}
		return a;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextLong();
		}
        long[] sum=new long[60];
        for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				long[] temp=XOR.xor(a[i], a[j]);
				sum=Add.add(sum, temp);
			}
		}
        long res=BinaryConversion.binaryToDecimal(sum);
        res%=(Math.pow(10, 9)+7);
        System.out.println(res);
	}
}