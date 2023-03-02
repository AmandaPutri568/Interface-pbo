/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasinterface;

/**
 *
 * @author lk5_17
 */
public class UjiKalkulator extends Kalkulator {
    public static void main(String[] agrs) {
        Kalkulator obj = new Kalkulator ();
        obj.pengurangan();
        obj.penjumlahan();
        
    Superhero obj2 = new Superhero();
    obj2.Superman();
    obj2.Spiderman();
    obj2.Thor();
    
    Bank obj3 = new Bank();
    obj3.Menabung();
    obj3.Transfer();
    obj3.Menarik();
    }
}
