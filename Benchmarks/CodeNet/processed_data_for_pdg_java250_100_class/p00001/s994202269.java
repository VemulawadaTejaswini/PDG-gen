class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int hight[];
        hight = new int[10];
        for(int i=0; i<hight.length; i++) {
            hight[i]=sc.nextInt();
        }
        Arrays.sort(hight);
        for(int i=0; i<3; i++) {
            System.out.println(hight[(hight.length-1-i)]);
        }
    }
}
