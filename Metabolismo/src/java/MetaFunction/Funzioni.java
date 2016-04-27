package MetaFunction;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
@WebService()
public class Funzioni {
    
    
    @WebMethod(operationName="inserisciPersona")
    public void inserisciPersona(String nome,String cognome, float peso){
        try{
            System.out.println("Import driver");
            String driver="org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver); 
            try{
                System.out.println("Connessione db");
                Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo");
                Statement sta= con.createStatement();
                System.out.println("Inserisco persona");
                sta.executeUpdate("insert into PERSONA (cognome,nome,peso)"
                        + "values ('"+cognome+"','"+nome+"',"+peso+")");
            }catch(SQLException SQLExc){SQLExc.printStackTrace();}
                        }catch(Exception e){e.printStackTrace();}
            
    
}
    
    @WebMethod(operationName="inserisciGiornata")
    public void inserisciGiornata(int giorno,int mese, int anno){
        try{
            System.out.println("Import driver");
            String driver="org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver); 
            try{
                System.out.println("Connessione db");
                Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo");
                Statement sta= con.createStatement();
                System.out.println("Inserisco giornata");
                sta.executeUpdate("insert into Giornata (giorno,mese,anno)"
                        + "values ("+giorno+","+mese+","+anno+")");
            }catch(SQLException SQLExc){SQLExc.printStackTrace();}
                        }catch(Exception e){e.printStackTrace();}
            
    
}
    
    
    @WebMethod(operationName="inserisciAttivita")
    public void inserisciAttivita(float ccosciainiz,float ccosciafine, float cavaniniz,float cavanfine,float pesofinale,float durata,float pesoiniziale){
        try{
            System.out.println("Import driver");
            String driver="org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver); 
            try{
                System.out.println("Connessione db");
                Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo");
                Statement sta= con.createStatement();
                System.out.println("Inserisco Attivita");
                sta.executeUpdate("insert into ATTIVITA (ccosciainiz,ccosciafine,cavaniniz,cavanfine,pesofinale,durata,pesoiniziale)"
                        + "values ("+ccosciainiz+","+ccosciafine+","+cavaniniz+","+cavanfine+","+pesofinale+","+durata+","+pesoiniziale+")");
            }catch(SQLException SQLExc){SQLExc.printStackTrace();}
                        }catch(Exception e){e.printStackTrace();}
            
    
}
    
    
}