class Main{
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] strs = str.split(" ");
        int[] strss = new int[3];
        for(int i=0;i<strs.length;i++) {
            strss[i]= Integer.parseInt(strs[i]);
        }
        for (int i = 0; i < strss.length; i++) {
      for(int j=i+1;j<strss.length;j++) {
      if(strss[i]>strss[j]) {
        int temp;
        temp=strss[j];
        strss[j]=strss[i];
        strss[i]=temp;
      }
    }
    }
    for (int i = 0; i < strss.length; i++) {
        if(i==2){
      System.out.println(strss[i]);
        }else{
            System.out.print(strss[i]+" ");
        }
    }
      }
  }
