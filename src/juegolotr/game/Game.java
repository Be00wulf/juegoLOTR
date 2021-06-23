package juegolotr.game;

import juegolotr.personaje.Bestia;
import juegolotr.personaje.Elfo;
import juegolotr.personaje.Heroe;
import juegolotr.personaje.Orco;
import juegolotr.personaje.Personae;

public class Game {
    private Heroe heroes[];
    private Bestia bestias[];
    
    public Game(){
        bestias = new Bestia[10];
        heroes = new Heroe[10];
        
    }
    
    //metodos
    public void horaDeJugar(){
        System.out.println(" ______________     _             _,-----------._        ___\n" +
"|              |   (_,.-      _,-'_,-----------._`-._    _)_)\n" +
"| THE _  _  _  |      |     ,'_,-'  ___________  `-._`.\n" +
"| |  / \\|_)| \\ |     `'   ,','  _,-'___________`-._  `.`.\n" +
"| |__\\_/| \\|_/ |        ,','  ,'_,-'     .     `-._`.  `.`.\n" +
"|              |       /,'  ,','        >|<        `.`.  `.\\\n" +
"| OF THE  _ _  |      //  ,','      ><  ,^.  ><      `.`.  \\\\\n" +
"| |_)||\\|/_(_  |     //  /,'      ><   / | \\   ><      `.\\  \\\\\n" +
"| | \\|| |\\_|_) |    //  //      ><    \\/\\^/\\/    ><      \\\\  \\\\\n" +
"|______________|   ;;  ;;              `---'              ::  ::\n" +
"                   ||  ||              (____              ||  ||\n" +
" DOORS OF DURIN   _||__||_            ,'----.            _||__||_\n" +
"                 (o.____.o)____        `---'        ____(o.____.o)\n" +
"                   |    | /,--.)                   (,--.\\ |    |\n" +
"                   |    |((  -`___               ___`   ))|    |\n" +
"                   |    | \\\\,'',  `.           .'  .``.// |    |\n" +
"                   |    |  // (___,'.         .'.___) \\\\  |    |\n" +
"                  /|    | ;;))  ____) .     . (____  ((\\\\ |    |\\\n" +
"                  \\|.__ | ||/ .'.--.\\/       `/,--.`. \\;: | __,|;\n" +
"                   |`-,`;.| :/ /,'  `)-'   `-('  `.\\ \\: |.;',-'|\n" +
"                   |   `..  ' / \\__.'         `.__/ \\ `  ,.'   |\n" +
"                   |    |,\\  /,                     ,\\  /,|    |\n" +
"                   |    ||: : )          .          ( : :||    |\n" +
"                  /|    |:; |/  .      ./|\\,      ,  \\| :;|    |\\\n" +
"                  \\|.__ |/  :  ,/-    <--:-->    ,\\.  ;  \\| __,|;\n" +
"                   |`-.``:   `'/-.     '\\|/`     ,-\\`;   ;'',-'|\n" +
"                   |   `..   ,' `'       '       `  `.   ,.'   |\n" +
"                   |    ||  :                         :  ||    |\n" +
"                   |    ||  |                         |  ||    |\n" +
"                   |    ||  |                         |  ||    |\n" +
"                   |    |'  |            _            |  `|    |\n" +
"                   |    |   |          '|))           |   |    |\n" +
"                   ;____:   `._        `'           _,'   ;____:\n" +
"                  {______}     \\___________________/     {______}\n" +
"              SSt |______|_______________________________|______|");
        
        
        this.llamarHeroe();
        this.llamarBestia();
        this.per(heroes);
        this.per(bestias);
        System.out.println();
        this.pelear();
    }
    
    public void pelear(){
        bestias[0].atacar(heroes[0]);
        heroes[0].atacar(bestias[0]);
    }
    
    public void per(Personae personajes[]){
        if (personajes.length> 0 ){
            String muestra = "";
            if (personajes[0] instanceof Bestia){
                muestra = "Bestia";
            }
            else{
                muestra = "Heroe";
            }

            System.out.println("\nRAZA: "+muestra);
            
            for (int i = 0; i < personajes.length; i++) {
                personajes[i].presentarPersonaje();
            }

        }
        else {
            System.out.println("???");
        }
    }
    
    public void llamarHeroe(){
        int x = 0;
        for (int i = 0; i < heroes.length; i++) {
            x = Dado.dadoAzar(0, 2, 1, false);
            if (x == 1) {
                heroes[i] = new Elfo("Elfo "+Elfo.getcontadorH());
            }
            
            else {
                heroes[i] = new Elfo("Elfo "+Elfo.getcontadorH());
            }
             
            
        }
    }
    
    public void llamarBestia(){
        int x = 0;
        for (int i = 0; i < heroes.length; i++) {
            x = Dado.dadoAzar(0, 1, 1, false);
            
            if (x == 1) {
                bestias[i] = new Orco("ORCO " + Orco.getcontadorO());
            }
            
            else {
                bestias[i] = new Orco("ORCO " + Orco.getcontadorO());
            }

        
        }
    }
    
    
}
