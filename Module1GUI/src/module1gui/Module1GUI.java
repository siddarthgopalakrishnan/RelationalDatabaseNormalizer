/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1gui;
import RelationalDatabase.*;

/**
 *
 * @author ASUS
 */
public class Module1GUI {

    /**
     * @param args the command line arguments
     */
    public static InputsPage inputsPage;
    public static RelationDetailsPage reldetPage;
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputsPage = new InputsPage();
        inputsPage.setVisible(true);
    }
    
}
