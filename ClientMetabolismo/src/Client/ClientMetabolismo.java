package Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class ClientMetabolismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    inserisciPersona("opici","marco",77);
    inserisciGiornata(27,4,2016);
    
    }

    private static void inserisciGiornata(int arg0, int arg1, int arg2) {
        metafunction.FunzioniService service = new metafunction.FunzioniService();
        metafunction.Funzioni port = service.getFunzioniPort();
        port.inserisciGiornata(arg0, arg1, arg2);
    }

    private static void inserisciPersona(java.lang.String arg0, java.lang.String arg1, float arg2) {
        metafunction.FunzioniService service = new metafunction.FunzioniService();
        metafunction.Funzioni port = service.getFunzioniPort();
        port.inserisciPersona(arg0, arg1, arg2);
    }
    
    
    
}
