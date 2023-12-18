class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int temp;
        for(int i=0;i<3;i++) arr[i] = sc.nextInt();
        for(int i=2;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
