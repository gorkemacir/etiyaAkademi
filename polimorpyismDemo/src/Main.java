public class Main {
    public static void main(String[] args) {
        BaseLogger[] baseLogger=new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
        for (BaseLogger logger:baseLogger){
            logger.Log("Log Mesajı");
        }
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();

    }
}