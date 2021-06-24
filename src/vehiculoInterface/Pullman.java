package src.vehiculoInterface;

public class Pullman extends Vehiculo implements Camioneta{

    @Override
    public void pasajeros(int pasajeros) {
        System.out.println("Estoy llevando "+ pasajeros+" de pasajeros.\n");
        
    }

    @Override
    public void girarALaDerecha() {
        System.out.println("Estoy girando al Pullman a la derecha.");
        
    }

    @Override
    public void girarALaIzquierda() {
        System.out.println("Estoy girando al Pullman a la izquierda.");
        
    }
    
}
