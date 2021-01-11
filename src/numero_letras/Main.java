/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_letras;

/**
 *
 * @author UABC-16653387
 */
public class Main {
    
    public static void main(String[] args) {
        Numero_Letras nl = new Numero_Letras();
        String numero = "4847.90";
        String literal = nl.Convertir(numero, true);
        System.out.println("Con letra: " + literal);
    }
}
