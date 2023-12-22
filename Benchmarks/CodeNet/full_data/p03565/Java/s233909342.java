import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
 
public class Main{
	
	static final Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
                String S=sc.next();
                String T=sc.next();
                boolean hantei=false;
                int l=T.length();
                int kaishi=0;
                int moji=0;
                for(int i=0;i<S.length()-l+1;i++){
                        for(int j=0;j<T.length();j++){
                                if((T.charAt(j)==S.charAt(j+i))||(S.charAt(i+j)=='?')){}else{
                                        break;
                                }
                                if(j==T.length()-1){
                                        hantei=true;
                                        kaishi=i;
                                }
                        }
                }
                if(!hantei){
                        System.out.println("UNRESTORABLE");
                }else{
                        char[]seikai=new char[60];
                        for(int i=0;i<S.length();i++){
                                if(i==kaishi){
                                        seikai[i]=T.charAt(moji);
                                        moji++;

                                }
                                else if((S.charAt(i)=='?')&&(moji==0)){
                                        seikai[i]='a';
                                }else if(S.charAt(i)=='?'){
                                        seikai[i]=T.charAt(moji);
                                        moji++;
                                        if(moji==T.length()){
                                                moji=0;
                                        }
                                }else{
                                        seikai[i]=S.charAt(i);
                                }

                        }
                        for(int i=0;i<S.length();i++){
                                System.out.print(seikai[i]);
                                if(i==S.length()-1){
                                        System.out.println();
                                }
                        }
        

                }
                
        
        
        

		
	}
}
