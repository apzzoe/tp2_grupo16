package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {

    public static void main(String[] args) {
        String textoOriginal = "Hoja";
        
        String textoModificado = textoOriginal.replace("ja", "la");
        
        System.out.println("Valor de textoOriginal: " + textoOriginal);
        System.out.println("Valor de textoModificado: " + textoModificado);
        //El valor de textoOriginal no cambia porque cuando llamamos al metodo replace(), lo que hace este metodo es  crear un nuevo objeto de texto con el valor de textoOriginal, valor el cual una vez modificado se va a insertar en la variable textoModificado.
        
    }
}
