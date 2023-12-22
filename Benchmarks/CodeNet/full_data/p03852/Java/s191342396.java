import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
 //    String[] nyu=sc.nextLine().split(" ");

     String nyu=sc.nextLine();
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]+nyu[2]);
//int C=Integer.parseInt(nyu[2]);
//int D=Integer.parseInt(nyu[3]);


String[] bo={"a","i","u","e","o"};

//StringBuffer sb = new StringBuffer(nyu);
//		String dst = sb.reverse().toString();

//     String nyu2=sc.nextLine();
//int E=Integer.parseInt(nyu2);



//double A=Double.parseDouble(nyu[0]);
//double B=Double.parseDouble(nyu[1]);
/*
switch(nyu){
case "H H":
System.out.println("H") ;
break;

case "D D":
System.out.println("H") ;
break;

case "H D":
System.out.println("D") ;
break;

case "D H":
System.out.println("D") ;
break;


default:
System.out.println("NO") ;

break;
}
*/

//int res=Math.min((A*B),C);

String res="consonant";
for(String tem:bo){
if(tem.equals(nyu))res="vowel";
}
//int res=0;
//for(int i=0;i<300;i++){
//if(num[i]==1)res=i;
//}

//char[] c = nyu.toCharArray();


//System.out.println(nyu+"-"+line_r_2+"-"+nyu2+"-"+line_r_1);



//if(D<1200){
//double res=Math.ceil((AB)/2);

//System.out.println("ABC");
//}else if(B<A){
//System.out.println("Alice");

//}else{
System.out.println(res);

//}




	}
}