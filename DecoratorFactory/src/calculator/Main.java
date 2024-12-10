package calculator;

/** Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
 * создали Loggable, LogCalculator, ConsoleLogger, LogCalculableFactory
 * 
*/
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
