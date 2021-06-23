package juegolotr.personaje;

public class Elfo extends Heroe{
    //variables
    
    //constructor de clase hija
    public Elfo(String nombrePersonaje) {
        super(nombrePersonaje, 65, 250);
    }
    
    @Override
    public void presentarPersonaje(){                                                                           ///////////////////////////////////
        System.out.println("Raza: Elfo            Nombre: " + this.nombrePersonaje);
    }
    
    @Override
    public double atacar(Personae victima){
        if (victima instanceof Orco) {
            System.out.println(this.getNombrePersonaje()+ " *flechazo*");
        }
        
        
        return this.getDanio();
    }
}
