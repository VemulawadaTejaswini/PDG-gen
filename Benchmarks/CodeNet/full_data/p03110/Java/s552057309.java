
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
int a =sca.nextInt();
double sum=0;
for (int i=0;i<a;i++) {
	double b=sca.nextDouble();
	String c=sca.next();
	if(c.equals("JPY")) {
		sum+=b;
	}
	else {
		sum+=b*380000.0;
	}
}
System.out.print(sum);

	}

}
