package WhileLAB;

import java.util.Scanner;

public class AccountBalance06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        while (count > 0) {
            double increase = Double.parseDouble(scanner.nextLine());
            if (increase < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", increase);
            count--;
            sum = sum + increase;
        }
        System.out.printf("Total: %.2f", sum);
    }
}

/*6. Баланс по сметка
Напишете програма, която пресмята колко общо пари има в сметката, след като направите определен брой
вноски. На първия ред ще получите колко вноски трябва да се направят. На всеки следващ ред ще
получавате сумата, която трябва да внесете в сметката, докато не се достигне броя вноски. При всяка
получена сума на конзолата трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката.
Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!" и програмата
да приключи. Когато програмата приключи трябва да се принтира "Total: " + общата сума в сметката
закръглена до втория знак след десетичната запетая.
Примерен вход и изход
вход        изход                 вход          изход
3          Increase: 5.51          5             Increase: 120
5.51       Increase: 69.42         120           Increase: 45.55
69.42      Increase: 100           45.55         Invalid operation!
100        Total: 174.93           -150           Total: 165.55

*/