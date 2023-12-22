

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		
		int cards[][] = new int[4][4] ;
		
		boolean flags[][] = new boolean[4][4] ;
		
		int num ;
		
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++)
				cards[i][j] = in.nextInt() ;
		
		int cnt = in.nextInt() ;
		
		int bingo = 0 ;
		
		while(cnt-->0) {
			
			num = in.nextInt() ;
			
			for(int i=0;i<3;i++) 
				for(int j=0;j<3;j++)
					if(cards[i][j]==num) { flags[i][j] = true ; bingo++ ; }
		}
		
		boolean flag = false ;
		//check
//		if(bingo>=5) {
//			flag = true ;
////			System.out.println("Yes");
//		}else {
			for(int i=0;i<3;i++) if(checkr(flags,i)) { flag=true ; break ;}
			for(int j=0;j<3;j++) if(checkc(flags,j)) { flag=true ; break ;}
			if(checkx(flags)) { flag=true ; }
//		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static boolean checkr(boolean[][] cards,int i) {
		boolean ans = false ;
		int cnt = 0 ;
		for(int j=0;j<3;j++) {
			if(cards[i][j]) cnt++ ;
		}
		if(cnt==3)
			ans = true ;
		return ans ;
	}
	public static boolean checkc(boolean[][] cards,int j) {
		boolean ans = false ;
		int cnt = 0 ;
		for(int i=0;i<3;i++) {
			if(cards[i][j]) cnt++ ;
		}
		if(cnt==3)
			ans = true ;
		return ans ;
	}
	public static boolean checkx(boolean[][] cards) {
		boolean ans = false ;
		if(cards[0][0]&&cards[1][1]&&cards[2][2]) { ans=true ; }
		if(cards[0][2]&&cards[1][1]&&cards[2][0]) { ans=true ; }
		return ans ;
	}
}
