public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        int[] a=new int[100000];
        while(true){
            a[p]=sc.nextInt();
            if(a[p]==0)break;
            p++;
        }
        for(int i=0;i<p;i++)System.out.println("Case "+(i+1)+": "+a[i]);
    } 
}
