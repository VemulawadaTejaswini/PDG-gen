import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		int ss = S.length();
		int tt = T.length();
		char[] chS = new char[ss];
		char[] chT = new char[tt];
		for( int i=0; i<ss; i++ ){
			chS[i] = S.charAt(i);        
		}
		for( int i=0; i<tt; i++ ){
			chT[i] = T.charAt(i);       
		}
		int x = 0,y = 0,b = 0;
		loop:for( int i=0; i<=ss-tt; i++ ){
			int a = i;
			int count = 0;          
			for( int j=0; j<tt; j++ ){
				if( chS[a]=='?' || chS[a]==chT[j] ){
					count++;
				}
				if( count==tt ){
					x = i;
					y = i+tt-1;	
					b = 1;                  
				}  
				a++;              
			}            
		}
		if( ss==1 ){
			b = 0;          
        }          
		if( b==1 ){   //if start   
		for( int i=0; i<x; i++ ){
			if( chS[i]=='?' ){
				System.out.print("a");
			}else{
				System.out.print(chS[i]);
			}
		}
		for( int i=0; i<tt; i++ ){
			System.out.print(chT[i]);
		}
		for( int i=y+1; i<ss; i++ ){
			if( chS[i]=='?' ){
				System.out.print("a");
			}else{
				System.out.print(chS[i]);
			}
		}
        }      //if end
		if( ss==1 ){
			if( S.equals(T) || S.equals("?") ){
				System.out.println(T);              
            }else{
				System.out.println("UNRESTORABLE");              
            }              
        }else{
			if( x==0 && y==0 ){
				System.out.println("UNRESTORABLE");              
            }              
        }          
	}
}
