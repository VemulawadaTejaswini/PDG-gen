import java.util.*;


public class Main{
public static void main(String[] args){
Scanner x= new Scanner(System.in);

String a = x.next();

for(int i =3;i<a.length();i++){
	for(int j=0;j<a.length()-i;j++){
	String temp = a.substring(j,j+i);
	if(check(temp)){
	System.out.print(j+1);
	System.out.print(" ");
	System.out.println(j+i);
	return;}
	
	}
}
	System.out.println("-1 -1");





}



public static boolean check(String a){
	int[] arr = new int[26];
	for(int i=0;i<a.length();i++ )
		arr[a.charAt(i)-'a']++;

	Arrays.sort(arr);
	int count=0;
	for(int i=0;i<25;i++){
	count+=arr[i];	
	}
	if(arr[25]>count)
		return true;
	return false;
}
}