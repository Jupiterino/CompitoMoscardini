public class Box {
    public void pitStop(String Pilota){

        System.out.println("STOP "+Pilota+" Entra ai Box");

        int Secondi = (int)((Math.random()*5)+1);
        try {
            Thread.sleep(1000*(Secondi));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("STOP "+Pilota+" Termina i Box");

    }
}