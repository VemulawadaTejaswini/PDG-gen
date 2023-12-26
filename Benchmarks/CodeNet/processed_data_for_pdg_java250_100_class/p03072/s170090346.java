public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=n;
        int[] array=new int[n];
        for(int i=0;i<n;++i){
            array[i] = sc.nextInt();
        }
        for(int i=n-1;i>0;--i){
            for(int j=i-1;j>=0;--j){
                if(array[j]>array[i]) {
                    r--;
                    break;
                }
            }
        }
        System.out.println(r);
    }
}
