import javax.swing.event.SwingPropertyChangeSupport;

public class Locadora {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("marca", "red", "placa");

        c1.setPlaca("gato");

        System.out.println(c1.getCor());
        System.out.println(c1.getPlaca());

    }
}
