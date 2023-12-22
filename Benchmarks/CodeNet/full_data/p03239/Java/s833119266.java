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
			c = sc.nextInt();
			t = sc.nextInt();
			if(t <= T && c < temp){
                temp = c;
			}
            i++;
		}
      if(temp != 1001){
      	min = temp;
        System.out.println(min);
      }else{
        System.out.println("TLE");
      }
      
      sc.close();
      return;
	  }
}