class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int tmp;
        for(int i = 0;i < a.length;i++){
            for(int j = i + 1;j < a.length;j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0;i < a.length - 1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length - 1]);
    }
}
