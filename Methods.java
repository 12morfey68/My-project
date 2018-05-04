import java.util.Scanner;

public class Methods {

    /**
     * 1. Написать метод возвращающий факториал заданного числа N
     *
     * @param x
     * @return
     */
    public long FactorialN(int x) {
        long Factorial = 1;
        int NextNumber = 1;
        do {
            NextNumber++;
            Factorial = Factorial * NextNumber;
        }
        while (NextNumber < x);
        return Factorial;
    }

    /**
     * 2. написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние
     * между точками.
     */
    public double GetDistanceTwoPoints(double x1, double y1, double x2, double y2) {
        double GetDistance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return GetDistance;
    }

    /**
     * 3. Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
     * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
     * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
     * должна быть длиннее суммы двух других
     */
    public boolean IsTriangleExists(int x, int y, int z) {
        if (((x + y) < z) || ((x + z) < y) || ((y + z) < x)) {
            return false;
        } else
            return true;
    }

    /**
     * 4. вывести треугольник из нулей на экран
     */
    public String TriangleOfZeros(String s, int x)
    {
        for (int Height = 0; Height < x; Height++)
        {
            for (int Widght = 0; Widght < Height; Widght++)
            {
                System.out.print(s);
            }
            System.out.println(s);
        }
        return " ";
    }

    /**
     * 5. Написать программу которая вычисляет индекс массы тела
     */
    public double HumanIMT(double x, int y) {
        x = x / 100;
        double IMT = y / Math.pow(x, 2);
        return IMT;
    }

    /**
     * 6. Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
     * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
     * просто принимать int на вход и определять есть ли в нем одинаковые цифры Использовать
     * изученные операторы Метод буленовский возвращает правда или ложь
     */
    public boolean IsSameNumbers() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Введите трехзначное число:   ");
        if (sc.hasNextInt())
        {
            x = sc.nextInt();
        }
        else
        {
            System.out.print("Введите трехзначное число:   ");
        }
        int FirstNumber = x / 100;
        int SecondNumber = (x % 100) / 10;
        int ThirdNumber = x % 10;
        if ((FirstNumber == SecondNumber) || (SecondNumber == ThirdNumber) || (FirstNumber == ThirdNumber)) {
            return true;
        } else
            return false;
    }

    /**
     * 7. написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на
     * вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает
     * на вход и что возвращает
     */
    public double VolumeOfWaterpool(double x, double y, double z) {
        x = x / 100;
        y = y / 100;
        z = z / 100;
        double WaterpoolVolume = x * y * z * 1000;
        return (WaterpoolVolume);
    }

    /**
     * 10. Вывести на экран строку S указанное количество раз N
     */
    public String String(String s, int n)
    {
        for (int i = 0; i < (n-1); i++)
        {
            System.out.println(s);
        }
        return s;
    }

    /**
     * 11. Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     */
    public int MinMaxSumm(int x, int y, int z) {
        int MinNumber = 0;
        int MaxNumber = 0;
        {
            if (x < y) {
                if (x < z) {
                    if (y < z) {
                        MinNumber = x;
                        MaxNumber = z;
                    } else {
                        MinNumber = x;
                        MaxNumber = y;
                    }
                } else {
                    MinNumber = z;
                    MaxNumber = y;
                }
            } else {
                if (x < z) {
                    MaxNumber = z;
                    MinNumber = y;
                } else {
                    if (y < z) {
                        MaxNumber = x;
                        MinNumber = y;
                    } else {
                        MaxNumber = x;
                        MinNumber = z;
                    }
                }
            }
            int Summ = MaxNumber + MinNumber;
            return Summ;
        }
    }

    /**
     * 12. Вычислить площадь треугольника
     */
    public double SquareOfTriangle(double x, double y, double z)
    {
        double HalfOfPerimetr = (x + y + z) / 2;
        double TriangleSquare = Math.sqrt(HalfOfPerimetr * (HalfOfPerimetr - x) * (HalfOfPerimetr - y) * (HalfOfPerimetr - z));
        return (TriangleSquare);
    }

    /**
     * 13. Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
     * вычисления площади треугольника
     */
    public double SquareOfHexagon(double a)
    {
        double HexagomSquare = 6 * SquareOfTriangle(a, a, a);
        return HexagomSquare;
    }

    /**
     * 14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     */
    public long SummOfFactorials(int x)
    {
        long FactorialsSumm = 0;
        for (int i=1;i<=x;i++)
            if ((i%2)!=0) {
                FactorialsSumm = FactorialsSumm + FactorialN(i);
            } else {
                FactorialsSumm = FactorialsSumm;
            }
        return FactorialsSumm;
    }

    /**15. Написать программу которая возвращает стоимость покупки с учетом дисконта
     Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
     скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
     *
     */
    public double SummWithDiscount(double x) {
        double DiscountSumm = 0;
            if ((x > 1000) & (x <= 2000))
            {
                DiscountSumm = x * 0.98;
            }
        else if ((x > 2000) & (x <= 5000))
        {
            DiscountSumm = x * 0.95;
        }
        else if (x > 5000)
        {
            DiscountSumm = x * 0.93;
        }
        else
            {
            DiscountSumm = x;
            }
        return DiscountSumm;
    }
}