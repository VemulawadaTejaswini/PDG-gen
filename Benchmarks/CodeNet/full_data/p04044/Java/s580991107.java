import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int stringAmount = Integer.parseInt(sc.next());
    int stringLength = Integer.parseInt(sc.next());
    String[] stringArray = new String[stringAmount];
    
    for(int i=0; i<stringAmount; i++){
      stringArray[i] = sc.next();
    }
    
    stringArray = merge(stringArray);
    
    StringBuilder builder = new StringBuilder();
    for(int i=0; i<stringAmount; i++){
      builder.append(stringArray[i]);
    }
    
    System.out.println(builder.toString());
  }
  
  private static String[] merge(String[] sArray){
    if(sArray.length == 1){
      return sArray;
    }else{
      String[] array1 = new String[sArray.length/2];
      String[] array2 = new String[sArray.length-sArray.length/2];
      for(int i=0; i<array1.length; i++){
        array1[i] = sArray[i];
      }
      for(int i=0; i<array2.length; i++){
        array2[i] = sArray[array1.length+i];
      }
      array1 = merge(array1);
      array2 = merge(array2);
      int i1 = 0;
      int i2 = 0;
      while(true){
        if(judge(array1[i1], array2[i2])){
          sArray[i1+i2] = array1[i1];
          i1++;
          if(i1 == array1.length){
            for(int j=0; j<sArray.length-i1-i2; j++){
              sArray[i1+i2+j] = array2[i2+j];
            }
            break;
          }
        }else{
          sArray[i1+i2] = array2[i2];
          i2++;
          if(i2 == array2.length){
            for(int j=0; j<sArray.length-i1-i2; j++){
              sArray[i1+i2+j] = array1[i1+j];
            }
            break;
          }
        }
      }
      return sArray;
    }
  }
  
  private static boolean judge(String s1, String s2){
    byte[] byte1 = s1.getBytes();
    byte[] byte2 = s2.getBytes();
    for(int i=0; i<byte1.length; i++){
      if((int)byte1[i] < (int)byte2[i]){
        return true;
      }else if((int)byte1[i] > (int)byte2[i]){
        return false;
      }
    }
    return true;
  }
}