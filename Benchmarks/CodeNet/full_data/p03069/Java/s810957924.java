import java.util.* ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		int len = in.nextInt() ;
		String line = in.next() ;
		int min = 0 ;
		for(int i=0;i<len;i++) {
			if(i==len-1)
				break ;
			if(line.charAt(i)=='#' && line.charAt(i+1)=='.') {
				min++ ;
			}
		}
		System.out.println(min) ;
	}

}
