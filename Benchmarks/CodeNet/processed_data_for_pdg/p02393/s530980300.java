class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int array[] = {a,b,c};
        boolean flag = false;
        int tmp;
        while(true) {
            if(flag){
                break;
            }
            flag = true;
            for (int i = 1; i < array.length; i++){
                if (array[i-1] > array[i]){
                    flag = false;
                    tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){
                System.out.printf("%d\n",array[i]);
            } else {
                System.out.printf("%d ",array[i]);
            }
        }
    }
}
