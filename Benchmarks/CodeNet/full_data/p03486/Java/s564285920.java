import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String Str=sc.next();
int N=Str.length();
String Tr=sc.next();
int M=Tr.length();
int[] ord=new int[Str.length()];
for(int i=0;i<Str.length();i++){
if(Str.charAt(i)=='a')ord[i]=0;
if(Str.charAt(i)=='b')ord[i]=1;
if(Str.charAt(i)=='c')ord[i]=2;
if(Str.charAt(i)=='d')ord[i]=3;
if(Str.charAt(i)=='e')ord[i]=4;
if(Str.charAt(i)=='f')ord[i]=5;
if(Str.charAt(i)=='g')ord[i]=6;
if(Str.charAt(i)=='h')ord[i]=7;
if(Str.charAt(i)=='i')ord[i]=8;
if(Str.charAt(i)=='j')ord[i]=9;
if(Str.charAt(i)=='k')ord[i]=10;
if(Str.charAt(i)=='l')ord[i]=11;
if(Str.charAt(i)=='m')ord[i]=12;
if(Str.charAt(i)=='n')ord[i]=13;
if(Str.charAt(i)=='o')ord[i]=14;
if(Str.charAt(i)=='p')ord[i]=15;
if(Str.charAt(i)=='q')ord[i]=16;
if(Str.charAt(i)=='r')ord[i]=17;
if(Str.charAt(i)=='s')ord[i]=18;
if(Str.charAt(i)=='t')ord[i]=19;
if(Str.charAt(i)=='u')ord[i]=20;
if(Str.charAt(i)=='v')ord[i]=21;
if(Str.charAt(i)=='w')ord[i]=22;
if(Str.charAt(i)=='x')ord[i]=23;
if(Str.charAt(i)=='y')ord[i]=24;
if(Str.charAt(i)=='z')ord[i]=25;
}
Arrays.sort(ord);
int[] order=new int[Tr.length()];
for(int i=0;i<Tr.length();i++){
if(Tr.charAt(i)=='a')order[i]=0;
if(Tr.charAt(i)=='b')order[i]=1;
if(Tr.charAt(i)=='c')order[i]=2;
if(Tr.charAt(i)=='d')order[i]=3;
if(Tr.charAt(i)=='e')order[i]=4;
if(Tr.charAt(i)=='f')order[i]=5;
if(Tr.charAt(i)=='g')order[i]=6;
if(Tr.charAt(i)=='h')order[i]=7;
if(Tr.charAt(i)=='i')order[i]=8;
if(Tr.charAt(i)=='j')order[i]=9;
if(Tr.charAt(i)=='k')order[i]=10;
if(Tr.charAt(i)=='l')order[i]=11;
if(Tr.charAt(i)=='m')order[i]=12;
if(Tr.charAt(i)=='n')order[i]=13;
if(Tr.charAt(i)=='o')order[i]=14;
if(Tr.charAt(i)=='p')order[i]=15;
if(Tr.charAt(i)=='q')order[i]=16;
if(Tr.charAt(i)=='r')order[i]=17;
if(Tr.charAt(i)=='s')order[i]=18;
if(Tr.charAt(i)=='t')order[i]=19;
if(Tr.charAt(i)=='u')order[i]=20;
if(Tr.charAt(i)=='v')order[i]=21;
if(Tr.charAt(i)=='w')order[i]=22;
if(Tr.charAt(i)=='x')order[i]=23;
if(Tr.charAt(i)=='y')order[i]=24;
if(Tr.charAt(i)=='z')order[i]=25;
}
order = Arrays.stream(order).boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
boolean flag=true;
int i=0;
while(ord[i]==order[i]){
i++;
if(i==Math.min(M, N))break;
}
if(ord[0]<order[0]){System.out.println("Yes");System.exit(0);}
if(ord[0]>order[0]){System.out.println("No");System.exit(0);}

//if(i==0&&ord[0]<order[0])
if(i==N&&M<=N){flag=false;}else if(ord[i-1]>order[i-1]){flag=false;}

    if(flag)System.out.println("Yes");
    if(!flag)System.out.println("No");
}
}