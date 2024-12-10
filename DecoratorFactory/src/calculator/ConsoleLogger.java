package calculator;
// Реализация интерфейса Logger (вывод в консоль)
public class ConsoleLogger implements Loggable{

    @Override
    public void log(String message) {
        System.out.println("LOG " + message);
    }

}
