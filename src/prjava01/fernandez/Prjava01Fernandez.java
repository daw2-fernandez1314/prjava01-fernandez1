/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01.fernandez;

/**
 *
 * @author ubu64
 */

import java.awt.Desktop;
import java.io.*;

public class Prjava01Fernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina web de Daniel Fernandez DAW2 UF4 Practica2");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web de Daniel Fernandez DAW2 UF4 Practica2");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
}