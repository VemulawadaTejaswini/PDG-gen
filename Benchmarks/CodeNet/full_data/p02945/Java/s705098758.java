import java.util.*;

class main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();

	int B = sc.nextInt();

	int C = A-B;

	int D = A*B;

	int E = A+B;

	if(C>=D && C>=E){

	System.out.printlin(C);	

  }

	else if(D>=C && D>=E){

	System.out.printlin(D);	

  }	

	else if(E>=D && E>=C){

	System.out.printlin(E);	

  }

 }
}