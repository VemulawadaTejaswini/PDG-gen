import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        String d;
		String [] str = new String [a+2];
        String [] str2 = new String [a];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a+2;i++){sb.append(".");}
        str[0] = sb.toString();
        str[a+1] = str[0];
        for(int i=1;i<a+1;i++){str[i] = "." + sc.next() + ".";}
        for(int i=1;i<a+1;i++){for(int j=1;j<b+1;j++){
        if(str[i].charAt(j)=="#")
        {sb.append("#");}else{c=0;}
        }
                            }
        for(int i=0;i<a;i++){System.out.println(str2[i];}  	
	}
}