import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int numOfCards = Integer.parseInt(line1[0]);
    int numOfHints = Integer.parseInt(line1[1]);
    
    int[] groupArray = new int[numOfCards];
    int x;
    int y;
    int groupX;
    int groupY;
    int groupMaxNum = 1;
    int numOfGroup = numOfCards;
    
    for(int i=0; i<numOfHints; i++){
      String[] hint = br.readLine().split(" ");
      x = Integer.parseInt(hint[0])-1;
      y = Integer.parseInt(hint[1])-1;
      
      groupX = groupArray[x];
      groupY = groupArray[y];
      
      if(groupX == 0){
        if(groupY == 0){
          groupArray[x] = groupMaxNum;
          groupArray[y] = groupMaxNum;
          groupMaxNum++;
          numOfGroup--;
        }else{
          groupArray[x] = groupY;
          numOfGroup--;
        }
      }else{
        if(groupY == 0){
          groupArray[y] = groupX;
          numOfGroup--;
        }else if(groupX != groupY){
          numOfGroup--;
          for(int j=numOfCards-1;j>=0; j--){
            if(groupArray[j] == groupY){
              groupArray[j] = groupX;
            }
          }
        }
      }
    }
    System.out.println(numOfGroup);
  }
}