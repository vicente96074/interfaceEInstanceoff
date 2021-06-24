package src.vehiculoInterface;

public class Volteo extends Vehiculo implements DeCarga{

    @Override
    public void cargar(int cantidadDeCarga) {
        System.out.println("Estoy cargando la cantidad de "+cantidadDeCarga+" toneladas.\n");
    }

    @Override
    public void girarALaDerecha() {
        System.out.println("Estoy girando al volteo a la derecha.");
        
    }

    @Override
    public void girarALaIzquierda() {
        System.out.println("Estoy girando al volteo a la izquierda.");
        
    }
    
}
