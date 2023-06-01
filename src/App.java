public class App {
    public static void main(String[] args) throws Exception {
        Semaforo sem = new Semaforo(1);
        Box b = new Box();

        Macchina M1 = new Macchina(1, "Ferrari", "Leclerc", sem, b);
        Macchina M2 = new Macchina(2, "Ferrari", "Sainz", sem, b);
        Macchina M3 = new Macchina(3, "RedBull", "Verstappen", sem, b);

        System.out.println(" --- START!!! --- ");

        M1.start();
        M2.start();
        M3.start();
        
        M1.join();
        M2.join();
        M3.join();

        System.out.println(" --- END!!! ---");
        
    }
}