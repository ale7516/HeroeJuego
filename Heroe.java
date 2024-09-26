
public class Heroe {

    private int vidas;
    private int x;
    private String nombre;
    private boolean saltando;

    public Heroe(int x, String nombre) {
        this.vidas = 3;
        this.nombre = nombre;
        this.x = x;
        this.saltando = false;
    }

    public int getVidas() {
        return vidas;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getSaltando() {
        return saltando;

    }

    public void avanzar() {
        x++;
        System.out.println(this.nombre + "esta listo para avanzar " + x);

        if (x % 10 == 0) {
            // Hay obstaculo
            if(this.saltando == true){
                // Avanza
               this.saltando = false;
            }
            else{
                this.vidas = this.vidas - 1;
                System.out.println("usted ha perdio una vida " + vidas);
                
            }
        }
    }

    public void saltar() {
        saltando = true;
            System.out.println(this.nombre + "esta saltando");

    }

}
