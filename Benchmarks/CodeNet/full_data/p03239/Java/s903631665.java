import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		int n,T,i,c,t,min,temp;
        i = 0;
        temp = 1001;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		T = sc.nextInt();

		while(i < n){
			t = sc.nextInt();
			c = sc.nextInt();
			if(t <= T && c < temp){
                temp = c;
			}
            i++;
		}
    min = c;
    System.out.println(min);
    
    sc.close();
	return;
	}
}