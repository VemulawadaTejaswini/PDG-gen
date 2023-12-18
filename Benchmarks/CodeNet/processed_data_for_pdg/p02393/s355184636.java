class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] ary = new Integer[3];
        for (int i = 0; i<ary.length ; i++){
            ary[i]= sc.nextInt();
        }
        Arrays.sort(ary);
        System.out.println(ary[0]+" "+ary[1]+" "+ary[2]);
    }
}
