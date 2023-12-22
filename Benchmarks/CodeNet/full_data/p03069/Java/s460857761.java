import java.util.* ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		int len = in.nextInt() ;
		String line = in.next() ;
		int min = 0 ;
		char[] cs = line.toCharArray() ;
		int zt1,zt2 ;
		for(int i=0;i<len;i++) {
			zt1 = zt2 = -1 ;
			if(i+1==len)
				break ;
			if(cs[i]=='#'&&cs[i+1]=='.') {
				if(i-1>=0) { // -> .
					if(cs[i-1]=='#') {
						// conflict
						zt1 = 0 ;
					}else {
						zt1 = 1 ;
					}
				}else {
					zt1 = 1 ;
				}
				
				if(i+2!=len) {
					if(cs[i+2]=='.') { // -> #
						// conflict
						zt2 = 0 ;
					}else {
						zt2 = 1 ;
					}
				}else {
					zt2 = 1 ;
				}
			}
			
			if(zt1==0&&zt2==1) {
				cs[i]='#' ;
				min++ ;
			}
			if(zt1==1&&zt2==1) {
				cs[i]='#' ;
				min++ ;
			}
			if(zt1==1&&zt2==0) {
				cs[i+1]='.' ;
				min++ ;
			}
			if(zt1==0&&zt2==0) {
				cs[i+1]='#' ;
				min++ ;
			}
		}
		System.out.println(min) ;
	}

}
