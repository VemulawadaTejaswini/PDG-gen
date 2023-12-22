import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str=sc.next();
int[] count=new int[26];
String temp;
for(int i=0;i<str.length();i++){
    for(int j=i;j<str.length();j++){
    temp=str.substring(i,j);
    if(temp.contains("a"))count[0]++;
    if(temp.contains("b"))count[1]++;
    if(temp.contains("c"))count[2]++;
    if(temp.contains("d"))count[3]++;
    if(temp.contains("e"))count[4]++;
    if(temp.contains("f"))count[5]++;
    if(temp.contains("g"))count[6]++;
    if(temp.contains("h"))count[7]++;
    if(temp.contains("i"))count[8]++;
    if(temp.contains("j"))count[9]++;
    if(temp.contains("k"))count[10]++;
    if(temp.contains("l"))count[11]++;
    if(temp.contains("m"))count[12]++;
    if(temp.contains("n"))count[13]++;
    if(temp.contains("o"))count[14]++;
    if(temp.contains("p"))count[15]++;
    if(temp.contains("q"))count[16]++;
    if(temp.contains("r"))count[17]++;
    if(temp.contains("s"))count[18]++;
    if(temp.contains("t"))count[19]++;
    if(temp.contains("u"))count[20]++;
    if(temp.contains("v"))count[21]++;
    if(temp.contains("w"))count[22]++;
    if(temp.contains("x"))count[23]++;
    if(temp.contains("y"))count[24]++;
    if(temp.contains("z"))count[25]++;
        for(int s=0;s<26;s++){
            if(2*count[s]>temp.length()){
            System.out.println((i+1)+" "+j);
            System.exit(0);
            }
        }
}

}
System.out.println("-1 -1");
}
}