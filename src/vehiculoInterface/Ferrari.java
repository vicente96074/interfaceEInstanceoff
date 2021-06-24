package src.vehiculoInterface;

public class Ferrari extends Vehiculo implements DeCarrera{

    @Override
    public void correr(int distancia) {
        System.out.println("El auto de carrera recorre: "+distancia+" kilometros.\n");
        
    }

    @Override
    public void girarALaDerecha() {
        System.out.println("Logica para girar al auto de carrera a la derecha");
        
    }

    @Override
    public void girarALaIzquierda() {
        System.out.println("Logica para girar al auto de carrera a la izquierda");
        
    }
    
}
