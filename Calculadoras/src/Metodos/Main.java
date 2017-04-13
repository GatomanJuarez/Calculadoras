/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

/*
* By GatomanJuarez
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Calculadora de metodos numericos\n"
                + "1.- Taylor\n"
                + "2.-Newthon Rapshon\n"
                + "3.-Secante\n"
                + "4.-Interpolacion de Newton\n"
                + "5.-Simpson\n"));

        switch (opcion) {
            case 1:
                Taylor tay = new Taylor();
                tay.show(true);
                break;
            case 2:
                NewthonRapshon newthon = new NewthonRapshon();
                newthon.show(true);
                break;
            case 3:
                Secante secante = new Secante();
                secante.show(true);
                break;
            case 4:
                NewtonInte newt = new NewtonInte();
                newt.show(true);
                break;
            case 5:
                Simpson bartolomeo = new Simpson();
                bartolomeo.show(true);
                break;
        }
    }

}
