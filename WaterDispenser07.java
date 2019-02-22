package WhileLAB;

import java.util.Scanner;

public class WaterDispenser07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());

        int countVolume = 0;
        int clicks = 0;
        while (volume > countVolume) {
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("easy")) {
                countVolume += 50;
            }
            if (input.equals("medium")) {
                countVolume += 100;
            }
            if (input.equals("hard")) {
                countVolume += 200;
            }
            clicks++;
        }if(volume<countVolume){
            System.out.printf("%dml has been spilled.",countVolume - volume);
            return;
        }
        System.out.printf("The dispenser has been tapped %d times.",clicks);
    }
}
/*7. Чаша с вода
Всеки офис си има диспансер за вода. Напишете програма, която отчита дали служител от офиса е успял да
напълни чашата си успешно.
Диспансерът има три бутона :
 Easy - лесен (50 милилитра)
 Medium - среден (100 милилитра)
 Hard - силен (200 милилитра)
Ще получите обемът на чашата и на всеки следващ ред кой бутон е бил натиснат. Ако чашата се напълни
или прелее програмата приключва.
Ако чашата прелее отпечатайте колко вода е била излята. При успешно напълване отпечатайте броят на
натисканията на бутона.
Примерен вход и изход
вход         изход                                       вход              изход
500         The dispenser has been tapped 5 times.       600               50ml has been spilled.
Hard                                                     Hard
Medium                                                   Medium
Easy                                                     Medium
Easy                                                     Easy
Medium                                                   Hard      */