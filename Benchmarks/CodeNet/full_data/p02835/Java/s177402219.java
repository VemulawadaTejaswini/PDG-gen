    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
			int[] a= new int[3];
			for(int i=0;i<3;i++)
			{
				a[i]=scan.nextInt();
			}
			int m = a[0];
			int n = a[1];
			int o = a[2];
			if(m+n+o>=22)
				System.out.println("bust");
			else
				System.out.println("win");
    	}
    }