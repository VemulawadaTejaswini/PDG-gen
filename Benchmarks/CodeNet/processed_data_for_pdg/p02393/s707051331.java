public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 2 - i ; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+"\n");
    }
}
