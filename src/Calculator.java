// Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
// Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
// Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
// Калькулятор умеет работать только с целыми числами.
// Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
// При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.
// При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
// При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
// Результатом операции деления является целое число, остаток отбрасывается.
// Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: некорректный ввод");
        }
    }

    public static String calc(String input) throws Exception {

        int a = 0;
        int b = 0;
        int result = 0;
        char operation = 0;
        String[] nums;
        String output;
        boolean Rom = false;

        if (input.matches("\\d{1,2}\s[+\\-*/]\s\\d{1,2}")) {
            nums = input.split("\s[\\+\\*/+]\s");
            operation = (input.substring(nums[0].length() + 1, nums[0].length() + 2)).charAt(0);
            a = Integer.parseInt(nums[0]);
            b = Integer.parseInt(nums[1]);
        } else {
            if (input.matches("\\d{1,4}\s[+\\-*/]\s\\d{1,4}")) {
                nums = input.split("\s[\\+\\*/+]\s");
                operation = (input.substring(nums[0].length() + 1, nums[0].length() + 2)).charAt(0);
                a = Roman.converterArab(nums[0]);
                b = Roman.converterArab(nums[1]);
            }
        }

        if (a <= 0 || a > 10 || b<=0 || b >10) {
            throw new Exception();
        }


        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        output = String.valueOf(result);

        return output;
    }
}