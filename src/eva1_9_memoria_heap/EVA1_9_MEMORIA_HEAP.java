/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_memoria_heap;

/**
 *
 * @author IvanTron
 */
public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        Prueba obj1 = new Prueba();
        System.out.println(obj1);
        System.out.println(obj1.valor);
        Prueba obj2 = new Prueba();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null;
        System.out.println(obj2.valor);
    }
    
}

class Prueba {
    int valor = 1000;
}