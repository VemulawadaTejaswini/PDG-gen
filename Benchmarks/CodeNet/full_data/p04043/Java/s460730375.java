    import java.util.*;
    public class Main {
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a[] = new int[3];
		int b[] = new int[2];
		b[0] = 0;
		b[1] = 0;

		for(int i=0;i<3;i++){

			a[i] = sc.nextInt();

			if(a[i] == 5){
				b[0]++;
			}
			else if(a[i] == 7){
				b[1]++;
			}
		}

		if((b[0] == 2) && (b[1] == 1)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
    	}
    }