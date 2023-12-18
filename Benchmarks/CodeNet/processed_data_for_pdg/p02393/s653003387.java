public class Main { 
public static void main(String args[]) { 
int n[] = new int[3];
Scanner sc = new Scanner(System.in);
n[0]=sc.nextInt();
n[1]=sc.nextInt();
n[2]=sc.nextInt();
for(int i=0;i<2;i++){
    for(int j=i+1;j<3;j++){
        if(n[i]>n[j]){
            int temp = n[i];
            n[i]=n[j];
            n[j]=temp;
        }
    }
}
System.out.print(n[0]);
System.out.print(" ");
System.out.print(n[1]);
System.out.print(" ");
System.out.println(n[2]);
 } }
