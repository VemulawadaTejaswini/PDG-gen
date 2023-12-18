public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10000];
        for(int i = 0;;i++){
            int x = sc.nextInt();
            if(x != 0)  arr[i] = x;
            else break;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Case "+(i+1)+": "+arr[i]);
        }
    }
}
