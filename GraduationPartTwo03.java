package WhileLAB;

import java.util.Scanner;

public class GraduationPartTwo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); String name = scanner.nextLine();

        int counter = 1;
        int countPoorGrade = 0;
        double sum = 0;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                sum += grade;
                counter++;
            }if(grade<4){
                countPoorGrade++;
            }if (countPoorGrade>=2){
                System.out.printf("%s has been excluded at %d grade",name,counter);
                return;
            }
        }double average = sum/12;
        System.out.printf("%s graduated. Average grade: %.2f",name,average);

    }
}
/*3. Завършване - част 2
Напишете програма, която изчислява средната оценка на ученик от цялото му обучение. На първия ред ще
получите името на ученика, а на всеки следващ ред неговите годишни оценки. Ученикът преминава в
следващия клас, ако годишната му оценка е по-голяма или равна на 4.00. Ако ученикът бъде скъсан повече
от един път, то той бива изключен и програмата приключва, като се отпечатва името на ученика и в кой
клас бива изключен.
При успешно завършване на 12-ти клас да се отпечата :
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
В случай, че ученикът е изключен от училище, да се отпечата:
"{име на ученика} has been excluded at {класа, в който е бил изключен} grade"
Стойността трябва да бъде форматирана до втория знак след десетичната запетая.
Примерен вход и изход
вход       изход                                      вход         изход
Gosho     Gosho graduated. Average grade: 5.53        Mimi        Mimi has been excluded at 8 grade
5                                                      5
5.5                                                    6
6                                                      5
5.43                                                   6
5.5                                                    5
6                                                      6
5.55                                                   6
5                                                      2
6                                                      3
6
5.43
5
            */