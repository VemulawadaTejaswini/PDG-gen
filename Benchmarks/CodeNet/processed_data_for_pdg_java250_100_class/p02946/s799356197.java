public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int x=sc.nextInt();
        int left= (x-k+1<-1000000 ? -1000000:x-k+1);
        int right=(x+k-1>1000000? 1000000:x+k-1);
        for(int i=left;i<=right;i++){
            System.out.println(i);
        }
    }
}
