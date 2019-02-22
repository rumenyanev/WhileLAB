package WhileLAB;

import java.util.Scanner;

public class NumberInRange01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in the range[1...100]");

        int num = Integer.parseInt(scanner.nextLine());
        while (num<1||num>100){
            System.out.println("Invalid number !");
            System.out.println("Enter a number in the range[1...100]");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        System.out.println("The number is: "+num);
    }
}
/*1. Число в диапазона [1…100]
Напишете програма, която въвежда цяло положително число n в диапазона [1…100]. При въвеждане на
число извън посочения диапазон, да се отпечата съобщение за грешка и потребителят да се подкани да
въведе ново число.
Примерен вход и изход
Вход / Изход

Еnter a number in the range [1...100]: 35
The number is: 35
Еnter a number in the range [1...100]: 105
Invalid number!
Еnter a number in the range [1...100]: 0
Invalid number!
Еnter a number in the range [1...100]: -200
Invalid number!
Еnter a number in the range [1...100]: 77
The number is: 77
*/