    import java.util.Scanner;
    class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextint();
        int c1 = c;
        int d1 = d;
        int tmp,r,x;
        if (c1 < d1) {
    		tmp = c1;
    		c1 = d1;
    		d1 = tmp;
    	}
    	r = c1 % d1;
    	while (r != 0) {
    		c1 = d1;
    		d1 = r;
    		r = c1 % d1;
    	}
    	x = x / d1;
        System.out.print(b-a+a/c+a/d-b/c-b/d+b/x-a/x);
        }
    }