package src.vehiculoInterface;

public abstract class Vehiculo {
    public abstract void girarALaDerecha();
    public abstract void girarALaIzquierda();
    
    

    public int getCantidadDeGalonesDeCombustible() {
        return cantidadDeGalonesDeCombustible;
    }
    public void setCantidadDeGalonesDeCombustible(int cantidadDeGalonesDeCombustible) {
        this.cantidadDeGalonesDeCombustible = cantidadDeGalonesDeCombustible;
    }
    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }
    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getAceleracionBase() {
        return aceleracionBase;
    }
    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(aceleracionBase);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + cantidadDeGalonesDeCombustible;
        result = prime * result + cantidadDePasajeros;
        result = prime * result + velocidadMaxima;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(aceleracionBase) != Double.doubleToLongBits(other.aceleracionBase))
            return false;
        if (cantidadDeGalonesDeCombustible != other.cantidadDeGalonesDeCombustible)
            return false;
        if (cantidadDePasajeros != other.cantidadDePasajeros)
            return false;
        if (velocidadMaxima != other.velocidadMaxima)
            return false;
        return true;
    }

    

    @Override
    public String toString() {
        return "Vehiculo [aceleracionBase=" + aceleracionBase + ", cantidadDeGalonesDeCombustible="
                + cantidadDeGalonesDeCombustible + ", cantidadDePasajeros=" + cantidadDePasajeros + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }



    private int cantidadDeGalonesDeCombustible;
    private int cantidadDePasajeros;
    private int velocidadMaxima;
    private double aceleracionBase;
}
