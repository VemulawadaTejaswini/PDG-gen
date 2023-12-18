class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a[] = new int[3];
        int num;
        int min;
        for(int i=0;i<3;i++){
            a[i] = stdIn.nextInt();
        }
        for(int i=0;i<3;i++){
            min = a[i];
            num = i;
            for(int j=i+1;j<3;j++){
                if(min>a[j]){
                    min = a[j];
                    num = j;
                }
            }
            if(num != i){
                a[num] = a[i];
                a[i] = min;
            }
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
}
