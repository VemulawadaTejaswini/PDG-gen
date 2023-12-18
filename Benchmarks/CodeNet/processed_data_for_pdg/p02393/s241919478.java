class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] answer = new int[3];
        for(int i=0;i<3;i++){
            answer[i] = sc.nextInt();
            for(int j=i;j>0;j--){
                if(answer[j]<answer[j-1]){
                    int num = answer[j];
                    answer[j] = answer[j-1];
                    answer[j-1] = num;
                }else{
                    break;
                }
            }
        }
        System.out.println(answer[0]+" "+answer[1]+" "+answer[2]);
    }
}
