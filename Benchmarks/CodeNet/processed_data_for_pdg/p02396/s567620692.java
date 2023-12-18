public class Main{
public static void main(String[] args) {
int[] array = new int[10000];
Scanner inp = new Scanner(System.in);
int a = 0;
while(a<10000){
array[a] = inp.nextInt();
System.out.println("Case "+(a+1)+": "+array[a]);
a++;
}
}
}
