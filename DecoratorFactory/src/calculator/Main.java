package calculator;

/**1) Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
 * создали Loggable, LogCalculator, ConsoleLogger, LogCalculableFactory
 * 2) Проект Observer: Добавить нового наблюдателя (сейчас два
    наблюдателя Master и Student), организовать наблюдение за
    объектом Company.

*/
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
