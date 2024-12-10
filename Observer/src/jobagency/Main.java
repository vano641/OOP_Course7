package jobagency;

/**2) Проект Observer: Добавить нового наблюдателя (сейчас два
    наблюдателя Master и Student), организовать наблюдение за объектом Company.
*/
public class Main {

    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");

        Junior junior = new Junior("ARTEM");

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        
        jobAgency.registerObserver(junior);

        for(int i = 0; i< 10; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
