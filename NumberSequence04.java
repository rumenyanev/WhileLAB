package WhileLAB;

import java.util.Scanner;

public class NumberSequence04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while (!input.equals("END")){
           int num = Integer.parseInt(input);
            if (num>maxNum){
                maxNum = num;
            }if (num<minNum){
                minNum = num;
            }input = scanner.nextLine();
        }
        System.out.printf("Max number: %d%n",maxNum);
        System.out.printf("Min number: %d",minNum);

    }
}
/*4. Редица цели числа
Напишете програма, която чете цели числа, докато не се получи командата "END". Принтирайте най-
голямото и най-малкото число сред въведените.
Примерен вход и изход
вход       изход                 вход      изход
10         Max number: 304       250       Max number: 1000
20         Min number: 0          5        Min number: 0
304                               2
0                                 0
50                                100
END                               1000
                                  END

*/