import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String scSetting = sc.nextLine();
        String[] settingArray = scSetting.split(" ");
        
        int nNumber = Integer.parseInt(settingArray[0]);
        int kNumber = Integer.parseInt(settingArray[1]);
        int qNumber = Integer.parseInt(settingArray[2]);

        ArrayList<Person> personArray = new ArrayList<>();

        for(int i=0; i < nNumber; i++){
            personArray.add(new Person(i+1, kNumber));
        }

        for(int i=0; i< qNumber; i++){
            int winner = sc.nextInt();
            for(Person p: personArray){
                if(p.getPersonNum()==winner){
                } else{
                    p.minus1Point();
                }
            }
        }

        for(Person p: personArray){
      
            if(p.getPoint() > 0){
               System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}

class Person{
    private int personNum;
    private int point;

    Person(int personNum, int point){
        this.personNum = personNum;
        this.point = point;
    }

    public int getPoint(){
        return this.point;
    }

    public void minus1Point(){
        this.point = this.point - 1;
    }

    public int getPersonNum(){
        return this.personNum;
    }

}