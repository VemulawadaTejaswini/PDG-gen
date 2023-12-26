public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int numberMochi = sc.nextInt();
        int[] diameterArray = new int[numberMochi];
        for(int i = 0; i < numberMochi; i++){
            diameterArray[i] = sc.nextInt();
        }
        List<Integer> duplicationArray = new ArrayList<>();
        int duplicationNumber = 0;
        for(int i = 0; i < diameterArray.length; i++){
            if(!duplicationArray.contains(diameterArray[i])){
                for(int j = i+1; j < diameterArray.length; j++){
                    if(diameterArray[i] == diameterArray[j]){
                        duplicationArray.add(diameterArray[j]);
                        duplicationNumber ++;
                    }
                }
            }
        }
        System.out.print(diameterArray.length-duplicationNumber);
    }
}
