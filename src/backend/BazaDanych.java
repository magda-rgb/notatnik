/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mszwa
 */
public class BazaDanych {
   public ArrayList<Notatka> pobierzNotatke() {
        ArrayList<Notatka> notatki=new ArrayList();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection polaczenie=
                    java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost;databaseName=N2232", /// trzeba na lapku sprwdzic jak sie łączy, może być inaczej////
                            "sa","2326");
            java.sql.PreparedStatement skladnia=
                    polaczenie.prepareStatement("{call dbo.pobierzFaktura}");
            java.sql.ResultSet rezultat=skladnia.executeQuery();
            notatki=new ArrayList();
            while(rezultat.next())
                notatki.add(new Notatka(rezultat.getInt("numer"),
                                rezultat.getString("nazwa"),
                                rezultat.getDate("podanadata"),
                                rezultat.getString("opis")
                ));
            polaczenie.close();
            return notatki;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(
            null,"Błąd "+e.getMessage(),"Błąd",
                    JOptionPane.ERROR_MESSAGE);
        }
        finally {
            return notatki;
        }
    } 
}
