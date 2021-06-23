package juegolotr.personaje;

public class Orco extends Bestia{
    private static int contadorO;
    
    
    
    public Orco(String nombrePersonaje) {
        super(nombrePersonaje, 30, 300);
    }
    
    
    
    
    public static int getcontadorO(){
        return Orco.contadorO;
    }
    
    
    
    
}
