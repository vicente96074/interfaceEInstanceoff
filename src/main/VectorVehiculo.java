package src.main;

import java.util.ArrayList;
import src.vehiculoInterface.*;

public class VectorVehiculo {

    public VectorVehiculo(){
        vehiculos = new ArrayList<Vehiculo>();
        Ferrari ferrari = new Ferrari();
        vehiculos.add(ferrari);

        Volteo volteo = new Volteo();
        vehiculos.add(volteo);

        Pullman pullman = new Pullman();
        vehiculos.add(pullman);

        System.out.println("     ----- Vehiculos usando interfaces -----");
        
        for(int i=0; i<vehiculos.size(); i++){
            if(vehiculos.get(i) instanceof Ferrari){
                vehiculos.get(i).girarALaDerecha();
                vehiculos.get(i).girarALaIzquierda();
                ferrari.correr(10);
            } else if(vehiculos.get(i) instanceof Volteo){
                vehiculos.get(i).girarALaDerecha();
                vehiculos.get(i).girarALaIzquierda();
                volteo.cargar(100);
            } else {
                vehiculos.get(i).girarALaDerecha();
                vehiculos.get(i).girarALaIzquierda();
                pullman.pasajeros(64);
            }
        }
    }

    private ArrayList<Vehiculo> vehiculos;
}
