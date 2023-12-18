class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int tmp = 0;
        if(i>j){
            tmp = i;
            i = j;
            j = tmp;
        }
        if(i>k){
            tmp = i;
            i = k;
            k = tmp;
        }
        if(j>k){
            tmp = j;
            j = k;
            k = tmp;
        }
        System.out.println(Integer.toString(i) + " " + Integer.toString(j) + " " + Integer.toString(k));
    }
}
