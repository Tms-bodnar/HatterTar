/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattertar;

/**
 *
 * @author bodnart
 */
public class Hattertar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Eszkoz[] eszkozok = new Eszkoz[5];
        eszkozok[0] = new Eszkoz("Pendrive", 8, 2.33);
        eszkozok[1] = new Eszkoz("WDHdd", 500, 425.5);
        eszkozok[2] = new Eszkoz("Kingston", 32, 15.56);
        eszkozok[3] = new Eszkoz("Toshiba", 1000, 766);
        eszkozok[4] = new Eszkoz("Drive", 15, 11.44);
        
        for (int i = 0; i < eszkozok.length; i++) {
            System.out.print("A ");
            eszkozok[i].kiirNev();
            System.out.print(" tároló ");
            eszkozok[i].kiirKapacitas();
            System.out.print(" Gb kapacitású, és ");
            eszkozok[i].kiirSzabadHely();
            System.out.println(" Gb szabad hely van rajta.");
        }
        int tempKapacitas = 0;
        double tempSzabadHely = 0;
        for (int i = 0; i < eszkozok.length; i++) {
            tempKapacitas = tempKapacitas + eszkozok[i].getKapacitas();
            tempSzabadHely = tempSzabadHely + eszkozok[i].getSzabadHely();
        }
        System.out.print("Összesen ");
        System.out.print(tempKapacitas + " Gb tárhely, és ezeken összesen ");
        System.out.print(tempSzabadHely + " Gb szabad hely áll rendelkezésre.");
    }
    
    }
   
