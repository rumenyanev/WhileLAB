package WhileLAB;

import java.util.Scanner;

public class Graduation02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double counter = 1;
        double sum = 0;
        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                sum += grade;
                counter++;
            }
        }double average = sum/12;
        System.out.printf("%s graduated. Average grade: %.2f",name,average);
    }
}
/*2. Завършване
Напишете програма, която изчислява средната оценка на ученик от цялото му обучение. На първия ред ще
получите името на ученика, а на всеки следващ ред неговите годишни оценки. Ученикът преминава в
следващия клас, ако годишната му оценка е по-голяма или равна на 4.00. Ако оценката му е под 4.00, той
ще повтори класа.
При успешно завършване на 12-ти клас да се отпечата:
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
Стойността трябва да бъде форматирана до втория знак след десетичната запетая.
Примерен вход и изход
вход          изход                                         вход      изход
Pesho        Pesho graduated. Average grade: 5.37            Ani     Ani graduated. Average grade: 5.45
4                                                            5
5.5                                                          5.32
6                                                            6
5.43                                                         5.43
4.5                                                          5
6                                                            6
5.55                                                         5.43
5                                                            5
6                                                            6
6                                                            5.5
5.43                                                         4.55
5                                                            5
                                                             6
                                                             5.56
                                                             6

*/
