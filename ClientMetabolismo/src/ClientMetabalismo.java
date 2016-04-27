/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class ClientMetabalismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    inserisciPersona("opici","marco",77);
    
    }

    private static void inserisciPersona(java.lang.String arg0, java.lang.String arg1, float arg2) {
        metafunction.FunzioniService service = new metafunction.FunzioniService();
        metafunction.Funzioni port = service.getFunzioniPort();
        port.inserisciDB(arg0, arg1, arg2);
    }

  
       
    
}
