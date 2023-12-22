import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputHPAndCountData = scanner.nextLine();
        String inputSkillDamageData = scanner.nextLine();
        scanner.close();

        // 入力データの編集
        String[] editedInputHPAndCountData = inputHPAndCountData.split(" ");
        int enemyHP = Integer.parseInt(editedInputHPAndCountData[0]);
        int skillCount = Integer.parseInt(editedInputHPAndCountData[1]);
        long totalDamage = 0;
        if (skillCount != 1) {
            String[] skillDamageList = inputSkillDamageData.split(" ");
            int[] skillDamage = new int[skillCount];
            for (int index = 0; index < skillCount; index++) {
                skillDamage[index] = Integer.parseInt(skillDamageList[index]);
                totalDamage += skillDamage[index];
            }
        } else {
            totalDamage = Integer.parseInt(inputSkillDamageData);
        }

        // 判定
        if (totalDamage >= enemyHP) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }

}