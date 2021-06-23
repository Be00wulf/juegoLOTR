package juegolotr.game;

public class Dado {
    //variables
      
    //constructor 
    public Dado(){
        
    }
    
    //metodo para generar el dado
    public static int dadoAzar(int mm, int mM, int da2, boolean datos){
        int dado = mm;
        int mayor = mm;
        for (int i = 1; i <= da2; i++) {
            dado =(int) Math.floor(Math.random()*(mM-mm+1)+mm);
            if (datos)
                System.out.println("Tiro "+i+" = "+ dado);
            if (mayor < dado)
                mayor = dado;
        }
        
        if (da2 > 1)
            if (datos)
                System.out.println("Gana el: "+ mayor);
        return mayor;
    }
    
    
}
