/**
 * Questa classe rappresenta L'auto
 * Simula i giri che fa durante la gara (10 giri)
 * @author Giovanni Moscardini
 */
public class Macchina extends Thread {
    
    private int n;
    private String scuderia;
    private String pilota;
    private Semaforo s;
    private Box b;

    
    public Macchina(int n, String scuderia, String pilota, Semaforo s, Box b) {
        this.n = n;
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.s = s;
        this.b = b;

        setName(pilota);
    }

    public int getN() {
        return n;
    }
    public String getScuderia() {
        return scuderia;
    }
    public String getPilota() {
        return pilota;
    }
  
    /**
     * il metodo run simula i 10 giri che fa l'auto
     * ogni tre giri l'auto chiama il metodo pit stop sul suo box (sezione critica)
     * attende un numero compreso tra 1 a 4 secondi
     * @return void
    */
    @Override
    public void run(){

        for(int i=0; i<10; i++){
            if(i%3==0 && i>0){
                s.P();
                    b.pitStop(getPilota());
                s.V();
            }
            int Nsecondi = ((int)((Math.random()*4)+1));
            try {
                Thread.sleep(1000*Nsecondi);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("GIRO-"+(i+1)+" Completato dal pilota: "+pilota);
        }


    }








}
