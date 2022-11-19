public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(){
        this.baseLogger=baseLogger;
    }
    public void Add(){
        this.baseLogger.Log("log mesajı");
        System.out.println("Müşteri Eklendi");
        DatabaseLogger databaseLogger = new DatabaseLogger();

    }
}
