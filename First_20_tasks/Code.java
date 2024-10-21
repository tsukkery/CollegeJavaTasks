import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;


    /**1. Функция для нахождения максимума
     * Напишите функцию, которая принимает два числа и возвращает максимальное из них.
     */
    public static int Max(int a, int b){
        if (a == b) {
            throw new IllegalArgumentException("Error");
        }
        return Math.max(a, b);
    }

    /** 2. Калькулятор деления
     *Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException
     */
    public static int Div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Делитель не может быть равен нулю");
        }
        return a / b;
    }

    /**3. Конвертер строк в числа
     Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
     */
    public void StrtoInt(String a) throws NumberFormatException {
        int a2 = Integer.parseInt(a.trim());
        System.out.println(a2);
    }

    /**4. Проверка возраста
     Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля
     */
    public static void AgeCheck(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("nonono");
        }
    }

    /**5. Нахождение корня
     Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.
     */
    public static double Sqrt(double a) {
        if (a < 0)
            throw new IllegalArgumentException("less then 0");
        return Sqrt(a);
    }

    /**6. Факториал
     Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
     */
    public static int Fact(int a){
        if (a < 0)
            throw new IllegalArgumentException("less then 0");
        int res = 1;
        for (int i = 1; i < a; i++) {
            res *= a;
        }
        return res;
    }

    /**7. Проверка массива на нули
     Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
     */
    public static void Zer(int[] a) {
        for (int num : a) {
            if (num == 0)
                throw new RuntimeException();
        }
    }

    /**8. Калькулятор возведения в степень
     Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
     */
    public static double Pow(int a, int b) {
        if (b < 0)
            throw new RuntimeException();
        return Math.pow(a, b);
    }

    /**9. Обрезка строки
     Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку,
     обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.
     */
    public static String Cut(String a, int b) {
        if (b > a.length())
            throw new RuntimeException();
        return a.substring(b);
    }

    /**10. Поиск элемента в массиве
     Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение
     */
    public static void Find(int[] a, int b){
        for (int num : a) {
            if (num == b) {
                System.out.println("Element is found!");
                break;
            }
        }
        throw new RuntimeException();
    }

    /**11. Конвертация в двоичную систему
     Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.
     */
    public static String toBin(int a) {
        if (a < 0)
            throw new RuntimeException();
        return Integer.toBinaryString(a);
    }

    /**12. Проверка делимости
     Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе.
     */
    public static int Div2(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("error");
        return a / b;
    }

    /**13. Чтение элемента списка
     Напишите функцию, которая возвращает элемент списка по индексу.
     Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.*/
    public static String ReturnElem(List<String> a, int b) {
        if (b > a.size())
            throw new IndexOutOfBoundsException();
        return a.get(b);
    }

    /**14. Парольная проверка
     Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.
     */
    public static void PasCheck(String password) {
        if (password.length() < 8)
            throw new WeakPasswordException();
    }

    public static class WeakPasswordException extends RuntimeException{}

    /**15. Проверка даты
     Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
     Если формат неверен, выбрасывайте DateTimeParseException.*/
    public static void DateCheck(String a) {
        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(a);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**16. Конкатенация строк
     Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.*/
    public static String Concat(String a, String b) {
        if (a == null || b == null)
            throw new NullPointerException();
        return a.concat(b);
    }

    /**17. Остаток от деления
     Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.*/
    public static int Left(int a, int b) {
        if (b == 0)
            throw new RuntimeException();
        return a % b;
    }

    /**18. Квадратный корень
     Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.*/
    public static double Sqrt2(double a) {
        if (a < 0)
            throw new RuntimeException();
        return Math.sqrt(a);
    }

    /**19. Конвертер температуры
     Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля,
     выбрасывайте исключение.*/
    public static int Fareng(int a) {
        if (a < 273)
            throw new RuntimeException();
        return a * 9/5 + 32;
    }

    /**20. Проверка строки на пустоту
     Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null,
     выбрасывайте исключение.*/
    public static void NullCheck(String a) {
        if (a == null || a.isEmpty())
            throw new RuntimeException();
    }


    public void main() {
    }
