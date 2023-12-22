import java.util.Scanner;


class Main{
    public static void main(String args[]){
	//	print();
	int x ;
	Scanner scan = new Scanner(System.in);

	x = scan.nextInt();

	if(x>100){
	    return;
	}

	int sum = 0;
	for(int n=1;1 <= n &&n <= x;n++){
	    sum = sum + n;
	}
	System.out.println(sum);

    }
    static void print(){
	System.out.println("hello world");
	return;
    }
}//1からnまで足す