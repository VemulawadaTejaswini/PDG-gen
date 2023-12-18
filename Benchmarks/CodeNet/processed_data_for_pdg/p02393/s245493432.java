class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number[] = new int[3];
        for (int i=0;i<3;i++){
            number[i]=sc.nextInt();
        }
        Arrays.sort(number);
        System.out.print(number[0] +" ");
        System.out.print(number[1] +" ");
        System.out.println(number[2]);
    }
}
