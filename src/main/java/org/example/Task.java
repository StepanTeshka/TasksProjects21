package org.example;

import java.util.Scanner;

public class Task {
    Scanner sc = new Scanner(System.in);
    public void task21 () {
        double x = 2;
        double answer = 1;
        double a = 2;
        double b = 3;
        double c = 1;
        for(int i = 1; i <=10; i++){
            if(i%2 != 0){
                answer = answer - (a/b)*Math.pow(x,c);
                a = a + 1;
                b = b + 1;
                c = c + 1;
            } else {
                answer = answer + (a/b)*Math.pow(x,c);
                a = a + 1;
                b = b + 1;
                c = c + 1;
            }
        }
        System.out.println(answer);
    }
    public void  task20 () {
        double answer = 0;
        for(int i = 1; i<= 100; i++ ){
            double solution = 1/(Math.sqrt(2*Math.pow(i,2) - 1));
            if(solution > 0.1){
                answer = solution;
                System.out.println("Answer " +  i);
                return;
            }
        }
    }
    public void task19() {
        double start = -1.0;
        double end = 1.0;
        double step = 0.2;
        System.out.println("Значения функции на интервале [-1;1] с шагом 0,2:");
        for (double x = start; x <= end; x += step) {
            double result =  Math.cbrt(1 + Math.pow(Math.cos(x), 2));
            System.out.println("f(" + x + ") = " + result);
        }
    }
    public void  task18 () {
        double answer = 0;
        for(int i = 1; i<= 100; i++ ){
            double solution = 1/(Math.sqrt(2*Math.pow(i,2) - 1));
            if(solution < 0.8){
                answer = solution;
                System.out.println("Answer= " + answer + " Число: " +  i);
                return;
            }
        }
    }
    public void task17() {
        System.out.println("Введите значение n");
        int n = sc.nextInt();
        int suitable = 0;
        double answer = 0;
        for(int i = 1; i <=n; i++){
            if(i == 1){
                answer = 14 / Math.sqrt(2 * Math.pow(i, 2) - 1);
            }else {
                answer = answer * 14 / Math.sqrt(2 * Math.pow(i, 2) - 1);
            }
            if (Math.sqrt(2 * Math.pow(i, 2) - 1) > 1/56){
                suitable++;
            }
        }
        System.out.println(answer);
        System.out.println("Количество больших чем 1/56: " + suitable);
    }
    public void  task16 () {
        int n = 10;
        long product = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                product *= i;
            }
        }

        System.out.println("Произведение чисел от 1 до " + n + ", кратных 3, равно " + product);
    }
    public void task15() {
        for (int i = 3; i <= 19; i++) {
            int cube = i * i * i; // Вычисляем куб числа
            System.out.println("Куб числа " + i + " равен " + cube);
        }
    }
    public void  task14() {
        System.out.println("Введите целое число N:");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i += 2) { // начинаем с 1 и увеличиваем на 2 для нечетных чисел
            sum += i;
        }

        System.out.println("Сумма нечетных чисел от 0 до " + N + " равна " + sum);
    }
    public void task13() {
        System.out.println("Введите номер единицы массы (1 - килограмм, 2 - миллиграмм, 3 - грамм, 4 - тонна, 5 - центнер):");
        int unit = sc.nextInt();

        System.out.println("Введите массу тела в выбранных единицах массы:");
        double mass = sc.nextDouble();

        double kilograms = 0.0;

        switch (unit) {
            case 1:
                kilograms = mass;
                break;
            case 2:
                kilograms = mass * 0.000001;
                break;
            case 3:
                kilograms = mass * 0.001;
                break;
            case 4:
                kilograms = mass * 1000.0;
                break;
            case 5:
                kilograms = mass * 100.0;
                break;
            default:
                System.out.println("Ошибка: Неправильный номер единицы массы.");
                return;
        }

        System.out.println("Масса тела в килограммах: " + kilograms + " кг");
    }
    public void task12() {
        System.out.println("Введите трехзначное число:");
        int number = sc.nextInt();

        if (number >= 100 && number <= 999) {
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = number / 100;

            if (digit1 % 2 == 0 && digit2 % 2 == 0 && digit3 % 2 == 0) {
                int product = digit1 * digit2 * digit3;
                System.out.println("Произведение цифр: " + product);
            } else {
                int sumOfSquares = digit1 * digit1 + digit2 * digit2 + digit3 * digit3;
                System.out.println("Сумма квадратов цифр: " + sumOfSquares);
            }
        } else {
            System.out.println("Ошибка: Введите трехзначное число.");
        }
    }
    public void task11() {
        System.out.println("Введите значение x:");
        double x = sc.nextDouble();
        double answer = 0;
        if(x > 1){
           answer = 1 + Math.sqrt(Math.abs(Math.cos(x)));
        }else if(x <-0.5){
            answer = 1 - Math.pow(x,2);
        }else {
            answer = x + 1;
        }
        System.out.println(answer);
    }
    public void task10() {
        System.out.println("Введите первое число:");
        int number1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int number2 = sc.nextInt();

        if (number1 % 2 == 0) {
            System.out.println(number1 + " является четным числом.");
        } else {
            System.out.println(number1 + " является нечетным числом.");
        }

        if (number2 % 2 == 0) {
            System.out.println(number2 + " является четным числом.");
        } else {
            System.out.println(number2 + " является нечетным числом.");
        }
    }
    public void  task9() {
        Point p1 = new Point(1, 1);
        Point q1 = new Point(10, 1);
        Point p2 = new Point(5, 0);
        Point q2 = new Point(5, 2);

        boolean intersect = doSegmentsIntersect(p1, q1, p2, q2);

        if (intersect) {
            System.out.println("Отрезки пересекаются.");
        } else {
            System.out.println("Отрезки не пересекаются.");
        }
    }
    public void task8() {
        System.out.println("Введите четырехзначное число:");
        int number = sc.nextInt();

        if (number >= 1000 && number <= 9999) {
            int thousands = number / 1000;
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;

            System.out.println("Цифры в числе:");

            System.out.println("Тысячи: " + (thousands % 2 == 0 ? "четная" : "нечетная"));
            System.out.println("Сотни: " + (hundreds % 2 == 0 ? "четная" : "нечетная"));
            System.out.println("Десятки: " + (tens % 2 == 0 ? "четная" : "нечетная"));
            System.out.println("Единицы: " + (units % 2 == 0 ? "четная" : "нечетная"));
        } else {
            System.out.println("Ошибка: Введите четырехзначное число.");
        }
    }
    public void task7() {
        System.out.println("Введите координаты вершин треугольника (x1 y1 x2 y2 x3 y3):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("Введите параметры прямой y = kx + b (k и b):");
        double k = sc.nextDouble();
        double b = sc.nextDouble();

        double x_bc = (x2 + x3) / 2;
        double y_bc = (y2 + y3) / 2;

        double m = (y_bc - y1) / (x_bc - x1);
        if (m == k) {
            System.out.println("Прямая y=kx+b содержит одну из высот треугольника.");
        } else {
            System.out.println("Прямая y=kx+b не содержит высот треугольника.");
        }
    }
    public void task6() {
        System.out.println("Введите порядковый номер месяца (1-12):");
        int monthNumber = sc.nextInt();

        int daysInMonth = 0;

        switch (monthNumber) {
            case 1: // Январь
            case 3: // Март
            case 5: // Май
            case 7: // Июль
            case 8: // Август
            case 10: // Октябрь
            case 12: // Декабрь
                daysInMonth = 31;
                break;
            case 4: // Апрель
            case 6: // Июнь
            case 9: // Сентябрь
            case 11: // Ноябрь
                daysInMonth = 30;
                break;
            case 2: // Февраль
                daysInMonth = 28;
                break;
            default:
                System.out.println("Некорректный номер месяца.");
                return;
        }

        System.out.println("Количество дней в месяце: " + daysInMonth);
    }
    public void task5() {
        System.out.println("Введите длину стороны a:");
        double a = sc.nextDouble();

        System.out.println("Введите длину стороны b:");
        double b = sc.nextDouble();

        System.out.println("Введите длину стороны c:");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Треугольник равносторонний.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Треугольник равнобедренный.");
        } else {
            System.out.println("Треугольник не является ни равносторонним, ни равнобедренным.");
        }
    }
    public void  task1() {
        System.out.println("Введите значение x:");
        double x= sc.nextDouble();
        double y = Math.sqrt(Math.pow(x, 2)) - 0.01;
        System.out.println(y);
    }
    public void task2() {
        System.out.print("Введите координаты вершины A (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Введите координаты вершины B (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Введите координаты вершины C (x3 y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double baseLength = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double height = 2 * calculateTriangleArea(x1, y1, x2, y2, x3, y3) / baseLength;

        System.out.println("Длина высоты из вершины A: " + height);
    }
    public void task3() {
        System.out.print("Введите длину катета a: ");
        double a = sc.nextDouble();
        System.out.print("Введите длину катета b: ");
        double b = sc.nextDouble();

        double area = 0.5 * a * b;
        System.out.println("Площадь прямоугольного треугольника: " + area);
    }
    public void task4() {
        System.out.println("Введите значение x:");
        double X = sc.nextDouble();
        System.out.println("Введите значение z:");
        double Z = sc.nextDouble();
        System.out.println("Введите значение y:");
        double Y = sc.nextDouble();
        double solution = (Math.pow(X, 2)- 5 * Math.pow(X, 3) - 3) - (4 + Math.pow(Y, 2));
        double answer = solution / (Math.pow(Z,2) + 5);
        System.out.println(answer);
    }
    public static double calculateTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
    public static boolean doSegmentsIntersect(Point p1, Point q1, Point p2, Point q2) {
        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        return (o1 * o2 <= 0 && o3 * o4 <= 0);
    }

    public static int orientation(Point p, Point q, Point r) {
        double val = (q.getY() - p.getY()) * (r.getX() - q.getX()) - (q.getX() - p.getX()) * (r.getY() - q.getY());

        if (val == 0) return 0;
        return (val > 0) ? 1 : -1;
    }
}
