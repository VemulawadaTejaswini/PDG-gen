import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[]a=new int[9];
    for(int i=0;i<9;i++)a[i]=sc.nextInt();
    int n=sc.nextInt();
    Map<Integer,Boolean> m=new HashMap<>();
    for(int i=0;i<n;i++)m.put(sc.nextInt(),true);
    boolean b=false;
    if(m.containsKey(a[0])&&m.containsKey(a[1])&&m.containsKey(a[2]))b=true;
    if(m.containsKey(a[3])&&m.containsKey(a[4])&&m.containsKey(a[5]))b=true;
    if(m.containsKey(a[6])&&m.containsKey(a[7])&&m.containsKey(a[8]))b=true;
    if(m.containsKey(a[0])&&m.containsKey(a[3])&&m.containsKey(a[6]))b=true;
    if(m.containsKey(a[1])&&m.containsKey(a[4])&&m.containsKey(a[7]))b=true;
    if(m.containsKey(a[2])&&m.containsKey(a[5])&&m.containsKey(a[8]))b=true;
    if(m.containsKey(a[0])&&m.containsKey(a[4])&&m.containsKey(a[8]))b=true;
    if(m.containsKey(a[2])&&m.containsKey(a[4])&&m.containsKey(a[6]))b=true;
    
    System.out.print(b?"Yes":"No");
  }
}
