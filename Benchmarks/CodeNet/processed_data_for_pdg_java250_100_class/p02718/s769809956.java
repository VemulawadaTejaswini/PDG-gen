public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M=sc.nextInt();
        float sum=0;
        Integer[] arr=new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int flag=1;
        Arrays.sort(arr, Collections.reverseOrder());
        Float l=(sum/(4*M));
        for (int i=0;i<M;i++){
            if(arr[i] < l){
                flag=0;
                break;
            }
        }
        if (flag==1)
            System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}
