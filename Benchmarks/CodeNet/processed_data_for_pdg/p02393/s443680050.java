class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int[] data ={a ,b ,c ,};
        for (int i =0;i < data.length;i++){
            for (int n = data.length-1;n > i;n--){
                if (data[n - 1] > data[n]){
                    int box = data[n - 1];
                    data[n - 1] = data[n];
                    data[n] = box;
                }
            }
        }
        System.out.println(data[0]+" "+data[1]+" "+data[2]);
    }
}
