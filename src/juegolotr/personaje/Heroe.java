package juegolotr.personaje;
import juegolotr.game.Dado;

public class Heroe extends Personae{
    private static int contadorH;

    //constructor
    public Heroe(String nombrePersonaje, double escudo, double vida) {
        super(nombrePersonaje, escudo, vida, true);
        Heroe.contadorH++;
    }
    
    //metodos
    @Override
    public double getDanio(){
        return Dado.dadoAzar(0, 100, 2, true);
         
    }
    
    public static int getcontadorH(){
        return Heroe.contadorH;
    }
 
    
    
    
    
}
