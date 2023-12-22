import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
static  Scanner sc = new Scanner(System.in);


public static void main(String[] args) {

int min=754;
String[] tr=sc.nextLine().split("");
for(int i=0;i<tr.length-2;i++){
String s=tr[i]+tr[i+1]+tr[i+2];
int te=Integer.parseInt(s);
min=Math.min(min,Math.abs(753-te));
}
System.out.println(min);

}

}


