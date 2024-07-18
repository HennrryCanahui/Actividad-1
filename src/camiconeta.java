import java.util.Random;

public class camiconeta extends vehiculo {
    private String color;
    public camiconeta(String Marca, String Modelo, String Propietario, String Color) {
        super(Marca, Modelo, Propietario );
        this.color= Color;
    }

    public void SubirPasajeros(){
        Random random = new Random();
        int Num = random.nextInt(3)+1;
        System.out.println("Se subieron " + Num + " personas");
    }

    public void BajarPasajeros(){
        Random random = new Random();
        int Num = random.nextInt(3)+1;
        System.out.println("Se bajaron " + Num + " personas");
    }
}
