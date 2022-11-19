public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager= new SqlServerDatabaseManager();
        System.out.println("Hello world!");
    }
}