package WhileLAB;

import java.util.Scanner;

public class Sequence2k08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        while (num <=n) {
            System.out.println(num);
          num = num * 2+1;

        }

    }
}
/*8. Редица числа 2k+1
Напишете програма, която чете число n, въведено от потребителя, и отпечатва всички числа ≤ n от редицата:
1, 3, 7, 15, 31, …. Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.
Примерен вход и изход
вход     изход    вход    изход    вход    изход      вход    изход
3         1        8       1        17       1         31      1
          3                3                 3                 3
                           7                 7                 7
                                             15                15
                                                               31

Тествайте решението си в judge системата: https://judge.softuni.bg/Contests/Compete/Index/1014#7
Подсказки:
 Започнете от num = 1.
 В цикъл докато num не стигне n, печатайте, умножавайте по 2 и прибавяйте 1.*/