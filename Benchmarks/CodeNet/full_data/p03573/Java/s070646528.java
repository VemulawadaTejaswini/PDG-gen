import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] a=new int[3];
HashMap<Integer,Integer> m=new HashMap<>();
for(int i=0;i<3;i++){
    a[i]=sc.nextInt();
    m.put(a[i],0);
}
for(int i=0;i<3;i++){
    int c=m.get(a[i]);
    c++;
    m.put(a[i],c);
}
for(int i:m.keySet()){
    if(m.get(i)==1){
    System.out.println(i);
    break;
    }
}
}}