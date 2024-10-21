import java.util.ArrayList;
import java.util.List;

/**Задача 1.
 Создание класса базы данных:
 Реализуйте класс, который будет представлять подключение к базе данных. Класс должен быть реализован как Singleton,
 чтобы при каждом обращении возвращался один и тот же объект.
 Требования:
 Класс должен быть Singleton.
 Метод подключения должен выводить сообщение о создании подключения.
 Проверьте, что при создании нескольких экземпляров — они ссылаются на один и тот же объект.
 */
class DBclass {
    private static final DBclass instance = new DBclass();

    private DBclass() {}

    public static DBclass getInstance() {
        return instance;
    }

    public void Connect(){
        System.out.println("Successful connection");
    }
}

/**Задача 2.
 Логирование в системе:
 Создайте класс для системы логирования, который реализует паттерн Singleton.
 Класс должен сохранять все сообщения логов в список и предоставлять метод для их вывода.
 Требования:
 Класс должен быть Singleton.
 Реализуйте метод для добавления сообщений в логи.
 Реализуйте метод для вывода всех логов.
 */
class SystemLogs {
    private static final SystemLogs SystemLogs = new SystemLogs();
    private static List<String> logs = new ArrayList<>();

    private SystemLogs() {}

    public void addLog(String log) {
        logs.add(log);
    }

    public void printLogs() {
        for (String log : logs)
            System.out.println(log);
    }
}

/**Enum
 Задача 3.
 Реализация статусов заказа:
 Создайте Enum для статусов заказа в интернет-магазине: NEW, IN_PROGRESS, DELIVERED, CANCELLED. Реализуйте класс Order, который будет хранить информацию о заказе и текущем статусе, а также методы для смены статуса.

 Требования:

 Определите Enum для статусов заказа.
 Реализуйте методы в классе Order для изменения и отображения статуса заказа.
 Реализуйте логику проверки переходов статусов, чтобы нельзя было отменить доставленный заказ.*/
enum OrderStatus {
    NEW, IN_PROGRESS, DELIVERED, CANCELLED;
}

class Order {
    private String Info;
    private OrderStatus status;

    public Order(OrderStatus status) {
        this.status = status;
    }

    public void setStatus(OrderStatus status) {
        if(this.status.equals(OrderStatus.DELIVERED) || status.equals(OrderStatus.CANCELLED))
            return;
        this.status = status;
    }

    public void print() {
        System.out.println(status);
    }
}

/**Задача 4.
 Сезоны года:
 Создайте Enum, представляющий времена года: WINTER, SPRING, SUMMER, AUTUMN. Затем реализуйте функцию, которая принимает значение этого Enum и возвращает соответствующее название сезона на русском языке.

 Требования:

 Определите Enum для сезонов.
 Реализуйте метод, который принимает сезон и возвращает строку с его названием.*/
enum Seasons {
    WINTER("Зима"), SPRING("Весна"), SUMMER("Лето"), AUTUMN("Осень");
    private final String name;

    Seasons(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
