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
    
    inserisciAttivita(1,1,1,1,1,1,1);
    
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

    private static void inserisciAttivita(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        metafunction.FunzioniService service = new metafunction.FunzioniService();
        metafunction.Funzioni port = service.getFunzioniPort();
        port.inserisciAttivita(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    
    
}
