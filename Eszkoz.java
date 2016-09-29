/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattertar;

/**
 *
 * @author user
 */
public class Eszkoz {

    String nev;
    int kapacitas;
    double szabadHely;
    
    public Eszkoz() {
    }
   public Eszkoz(String nev, int kapacitas, double szabadHely) {
       this.nev = nev;
       this.kapacitas = kapacitas;
       this.szabadHely = szabadHely;
   }
   public double getSzabadHely(){
       return szabadHely;
   }
   public int getKapacitas(){
       return kapacitas;
   }
   public void kiirNev(){
       System.out.print(nev);
   }
   public void kiirKapacitas(){
       System.out.print(kapacitas);
   }
   public void kiirSzabadHely(){
       System.out.print(szabadHely);
   }
   
}
