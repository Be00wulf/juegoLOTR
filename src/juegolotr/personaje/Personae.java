package juegolotr.personaje;

public class Personae {
    //variables
    protected String nombrePersonaje;
    protected double escudo, vida, danio;
    private static int contadorP;
    protected boolean furia;
    
    //constructor
    public Personae(String nombrePersonaje, double escudo, double vida, boolean furia) {
        contadorP++;
        this.nombrePersonaje = nombrePersonaje;
        this.escudo = escudo;
        this.vida = vida;
        this.furia = furia;
    }
    
    //metodos
    public void teHanAtacado(Personae verdugo){
        double golpe;
        System.out.println("ATAQUEN\n");
        System.out.println(this.getNombrePersonaje() + " vs " +  verdugo.getNombrePersonaje());
        
        golpe = this.generarEscudo(verdugo) - verdugo.atacar(this);
        
        if (golpe <= 0) {
            this.vida = this.vida + golpe;
        } 
        else if (golpe >= 0) {
            golpe = 0; 
        }
        System.out.println("Resumen de pelea");
        System.out.println(this.getNombrePersonaje() + " HAS RECIBIDO DAÑO");
        System.out.println("Daño: " + golpe + "\nVida restante: " + this.getVida());
    }
    
    public void presentarPersonaje(){                                                                           ///////////////////////////////////
        System.out.println("PERSONAJE: " + this.nombrePersonaje);
    }
    
    public double atacar(Personae victima){
        return this.getDanio();
    }
    
    public double generarEscudo(Personae enemigo){
        return this.getEscudo();
    }    
                
    //get set
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public double getEscudo() {
        return escudo;
    }

    public void setEscudo(double escudo) {
        this.escudo = escudo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public static int getContador() {
        return Personae.contadorP;
    }

    public boolean isFuria() {
        return furia;
    }

    public void setFuria(boolean furia) {
        this.furia = furia;
    }
    
    
    
    
    
    
    
    
    
}
