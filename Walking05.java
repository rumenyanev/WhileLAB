package WhileLAB;

import java.util.Scanner;

public class Walking05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countSteps = 0;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            countSteps += steps;

            if (countSteps >= 10000) {

                System.out.println("Goal reached! Good job!");
                break;
            } else {
                input = scanner.nextLine();

            }


        }
        if (input.equals("Going home") || countSteps < 10000) {
            int lastSteps = Integer.parseInt(scanner.nextLine());
            int totalSteps = countSteps + lastSteps;
            if (totalSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
            } else {
                int lostSteps = 10000 - totalSteps;
                System.out.printf("%d more steps to reach goal.", lostSteps);
            }
        }
    }
}
/*5. Стъпки
Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден.
Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си. Напишете
програма, която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня и когато
постигне целта си да се изписва "Goal reached! Good job!"
Ако иска да се прибере преди това, тя ще въведе командата "Going home" и ще въведе стъпките, които е
извървяла докато се прибира. След което, ако не е успяла да постигне целта си, на конзолата трябва да се
изпише: "{разликата между стъпките} more steps to reach goal."
Примерен вход и изход
Вход        Изход                             Вход       Изход
1000       Goal reached! Good job!            1500       2500 more steps to reach goal.
1500                                           300
2000                                          2500
6500                                          3000
                                              Going home
                                              200

Вход        Изход                             Вход         Изход
1500       Goal reached! Good job!             125         Goal reached! Good job!
3000                                           250
250                                           4000
1548                                            30
2000                                          2678
Going home                                    4682
2000

 */