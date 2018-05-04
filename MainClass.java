import java.util.Scanner;

public class MainClass {
    public static void main (String [] args) {
        Methods methods = new Methods();

        /**1. Написать метод возвращающий факториал заданного числа N
        *
         */
        long Factorial = methods.FactorialN(5);
        System.out.println(Factorial);

        /**2. написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние
         * между точками.
         *
         */
        double GetDistance = methods.GetDistanceTwoPoints(3.789, 7.13, 4.7923, 5.478);
        System.out.println(GetDistance);

        /**3. Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
         * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
         * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
         * должна быть длиннее суммы двух других
         *
         */
        boolean IsTriangleExists = methods.IsTriangleExists(7, 11, 5);
        System.out.println(IsTriangleExists);

        /**4. вывести треугольник из нулей на экран
         *
         */
        String TriangleOfZeros = methods.TriangleOfZeros("0",3);
        System.out.println(TriangleOfZeros);


        /**5. Написать программу которая вычисляет индекс массы тела
         *
         */
        double IMT = methods.HumanIMT(167, 65);
        System.out.println(IMT);

        /**6. Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
         * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
         * просто принимать int на вход и определять есть ли в нем одинаковые цифры Использовать
         * изученные операторы Метод буленовский возвращает правда или ложь
         *
         */
        boolean HaveSameNumbers = methods.IsSameNumbers();
        System.out.println(HaveSameNumbers);

        /**7. написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на
         * вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает
         * на вход и что возвращает
         *
         */
        double WaterpoolVolume = methods.VolumeOfWaterpool(167,253,300);
        System.out.println(WaterpoolVolume);

        /**8. При поступлении в вуз абитуриенты, получившие &quot;двойку&quot; на первом экзамене, ко второму не
         допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
         Подсчитать, сколько человек не допущено ко второму экзамену.
         *
         */
        int [] A = {5,4,2,2,5,2,3,5,5,2};
        int BadStudentsQuantity = 0;
        for (int n = 0; n<10; n++)
        {
            if (A[n]==2)
        {
            BadStudentsQuantity++;
        }
        else
            BadStudentsQuantity = BadStudentsQuantity;
        }
        System.out.println(BadStudentsQuantity);

        /**9. У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-
            продажи в банках города. В городе N банков. Составьте программу, определяющую, какой банк
            выбрать, чтобы выгодно обменять доллары на рубли.
        *
         */
        String [] Banks = {"ПриватБанк","Банк Пивденный","Кредобанк","Таскомбанк","Аккордбанк","Асвио Банк","Банк Восток"};
        double [] Course = {25.9,26.1,25.85,26.00,25.92,25.7,25.8};
        double  MaxCourse = 0;
        int Index = 0;
        for (int n=0; n<(Banks.length-1); n++)
        {
            if (MaxCourse < Course[n])
        {
            MaxCourse = Course[n];
            Index = n;
        }
            else
             MaxCourse = MaxCourse;
            Index = Index;
        }
        System.out.println(Banks[Index]);

        /**10. Вывести на экран строку S указанное количество раз N
         *
         */
        String String = methods.String("Don't worry, be happy", 5);
        System.out.println(String);

        /**11. Написать программу нахождения суммы большего и меньшего из 3-х чисел.
         *
         */
        int MinMaxSumm = methods.MinMaxSumm(534,888,111);
        System.out.println(MinMaxSumm);

        /**12. Вычислить площадь треугольника
         *
         */
        double TriangleSquare = methods.SquareOfTriangle(6.6, 5.8,7.1);
        System.out.println(TriangleSquare);

        /**13. Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
         вычисления площади треугольника
         *
         */
        double HexagonSquare = methods.SquareOfHexagon(7.52);
        System.out.println(HexagonSquare);

        /**14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
         *
         */
        long FactorialsSumm = methods.SummOfFactorials(9);
        System.out.println(FactorialsSumm);

        /**15. Написать программу которая возвращает стоимость покупки с учетом дисконта
        Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
        скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
        *
        */
        double DiscountSumm = methods.SummWithDiscount(5000);
        System.out.println(DiscountSumm);

    }
}


