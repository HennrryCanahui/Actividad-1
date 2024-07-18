import java.util.Random;

public class vehiculo {

    public vehiculo(String Marca, String Modelo, String Propietario){
    }

    public void Encender() throws InterruptedException {
        System.out.println("No enciende..");
        Thread.sleep(1500);
        System.out.println("Ya encendio!");
    }

    public void Apagar() throws InterruptedException{
        System.out.println("El carro se apagara..");
        Thread.sleep(1000);
        System.out.println("El carro se apago");
    }

    public void Chocar() {
        Random random = new Random();
        int Num = random.nextInt(3);
        switch (Num) {
            case 0:
                System.out.println("Chocaste con un poste...");
                break;
            case 1:
                System.out.println("Chocaste con un muro...");
                break;
            case 2:
                System.out.println("Chocaste contra otro carro...");
                break;
            default:
                System.out.println("No sé con qué chocaste...");
                break;
        }
    }

    public void EncenderLuces(){
        System.out.println("Se encienden las luces");
    }

    public void BajarVidrios(){
        System.out.println("Se bajaron los vidrios");
    }

    public void Acelerar(){
        System.out.println("El vehículo está acelerando");
    }

    public void Frenar(){
        System.out.println("El vehículo está frenando");
    }

    public void TocarBocina(){
        System.out.println("Tocando la bocina");
    }

    public void GirarIzquierda(){
        System.out.println("El vehículo está girando a la izquierda");
    }

    public void GirarDerecha(){
        System.out.println("El vehículo está girando a la derecha");
    }

    public void RevisarCombustible(){
        Random random = new Random();
        int nivelCombustible = random.nextInt(101);
        System.out.println("El nivel de combustible es: " + nivelCombustible + "%");
    }
}
