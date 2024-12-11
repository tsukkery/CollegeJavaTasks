import java.util.*;
import java.util.function.*;


public class lambda {
}

/**Задача 1: Удвоение чисел
 Создайте лямбда-выражение, которое принимает число и возвращает его удвоенное значение.
 Затем примените это выражение к списку чисел и выведите результат.*/
interface Double {
    int DoubleValue(int a);
}
class Task1 {
    public static void main(String... args) {
        Double dub;
        dub = (int a) -> {return a * 2;};
        System.out.println(dub.DoubleValue(5));
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (int i = 0; i < nums.size();i++)
            System.out.println(dub.DoubleValue(nums.get(i)));
    }
}

/**Задача 2: Фильтр положительных чисел
 Создайте лямбда-выражение для фильтрации положительных чисел из списка. Используйте его вместе с методом
 filter из Stream API, чтобы оставить только положительные числа в списке.*/
class Task2 {
    public static void main(String... args) {
        int[] numbers = new int[]{-1, -2, 1, 2, 3, -5, 100};
        Function<int[], int[]> func = x -> Arrays.stream(x).filter(num -> num >= 0).toArray();

        numbers = func.apply(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
    }

}

/**3: Преобразование списка строк в их длины
 Дан список строк. Используйте лямбда-выражение для преобразования каждой строки в её длину и сохраните результат в новом списке.
 */
class Task3 {
    public static void main(String... args) {
        List<String> strings = Arrays.asList("a", "abc", "cat", "haitah");
        Function<String, Integer> func = String::length;
        List<Integer> result = strings.stream().map(func).toList();

        System.out.println(result);
    }
}

/**4: Поиск слов по длине
 Дан список слов. Напишите лямбда-выражение, которое проверяет, содержит ли слово больше пяти символов.
 Используйте его для фильтрации и создания нового списка только с длинными словами.*/
class Task4 {
    public static void main(String... args) {
        List<String> strings = Arrays.asList("hi", "world", "abundance", "money");
        Predicate<String> func = x -> x.length() >= 5;
        List<String> res = strings.stream().filter(func).toList();

        System.out.println(res);
    }
}

/**5: Подсчёт символов 'a'
 Дан список слов. Напишите лямбда-выражение, которое подсчитывает количество символов 'a' в каждом слове и выводит результат.*/
class Task5 {
    public static void main(String... args) {
        List<String> words = Arrays.asList("apple", "banana", "rawrawraw", "cat");
        words.forEach(word -> {
            long count = word.chars().filter(ch -> ch == 'a').count();
            System.out.println("'a': " + count);
        });
    }
}

/**6: Применение операции к каждому элементу
 Создайте лямбда-выражение, которое выводит каждый элемент списка на консоль, умножая его на 3 перед выводом.
 */
class Task6 {
    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number * 3));
    }
}

