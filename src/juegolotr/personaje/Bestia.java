package juegolotr.personaje;
import juegolotr.game.Dado;

public class Bestia extends Personae{
    //variables
    
    //coonstructor
    public Bestia(String nombrePersonaje, double escudo, double vida) {
        super(nombrePersonaje, escudo, vida, true);
    }
    
    //metodos YA SOPLO SE MANEJA UN DADO POR BESTIA
    @Override
    public double getDanio(){
        return Dado.dadoAzar(0, 90, 1, true);
    }
    
    
    
}
