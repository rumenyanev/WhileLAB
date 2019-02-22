package WhileLAB;

import java.util.Scanner;

public class Moving09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int volume = width * length * height;

        while (!input.equals("Done")) {
            int box = Integer.parseInt(input);

            if ((volume - box) < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volume - box));
                volume = volume - box;
                break;
            }
            volume -= box;
            input = scanner.nextLine();

        }

        if (volume >= 0) {
            System.out.println(volume + " Cubic meters left.");
        }
    }
}



/*9. *Преместване

На осемнадесетия си рожден ден на Хосе взел решение, че ще се изнесе да живее на квартира. Опаковал
багажа си в кашони и намерил подходяща обява за апартамент под наем. Той започва да пренася своя багаж
на части, защото не може да пренесе целия наведнъж. Има ограничено свободно пространство в новото си
жилище, където може да разположи вещите, така че мястото да бъде подходящо за живеене.
Напишете програма, която изчислява свободния обем от жилището на Хосе, който остава след като
пренесе багажа си.
Бележка: Един кашон е с точни размери: 1m. x 1m. x 1m.
Вход
Потребителят въвежда следните данни на отделни редове:
1. Широчина на свободното пространство - цяло число в интервала [1...1000]
2. Дължина на свободното пространство - цяло число в интервала [1...1000]
3. Височина на свободното пространство - цяло число в интервала [1...1000]
4. На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в
квартирата - цели числа в интервала [1...10000]
Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място
свърши.
Изход
Да се отпечата на конзолата един от следните редове:
- Ако стигнете до командата "Done" и има още свободно място:
"{брой свободни куб. метри} Cubic meters left."
- Ако свободното място свърши преди да е дошла команда "Done":
"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."
Примерен вход и изход
Вход         Изход                                                Обяснение
10         No more free space! You need 2 Cubic meters more.       10 * 10 * 2 = 200 кубични метра.
10                                                                 20 + 20 + 20 + 20 + 122 = 202 кубични метра.
2                                                                  200 - 202 = 2 недостигащи кубични метра
20
20
20
20
122


Вход         Изход                                                Обяснение
10          Done 10 Cubic meters left.                          10 * 1 * 2 = 20 кубични метра.
1                                                               4 + 6 = 10 кубични метра.
2                                                               20 - 10 = 10 кубични метра.
4
6
        */