import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int [] monthlyPayments = {20000, 215000, 256, 3000, 5255};

        int sumOfPayments = 0;
        for (int payment: monthlyPayments){
            sumOfPayments += payment;
        }

        System.out.println("Сумма трат за месяц составила " + sumOfPayments + " рублей");

        //task 2
        int [] monthlyPayments2 = {20000, 215000, 256, 3000, 5255};

        Arrays.sort(monthlyPayments2);

        System.out.println("Минимальная сумма трат за неделю составила " + monthlyPayments2[0] +  "рублей. Максимальная " +
                "сумма трат за неделю составила " + monthlyPayments2[monthlyPayments2.length - 1] + " рублей");

        //task 3
        int [] monthlyPayments3 = {20000, 215000, 256, 3000, 5255};

        int sumPaymemts = 0;
        for (int payment :monthlyPayments3){
            sumPaymemts += payment;
        }
        double averageValuePayments = sumPaymemts / monthlyPayments3.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageValuePayments + " рублей");

        //task 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i --){
            System.out.print(reverseFullName[i]);
        }
    }
}