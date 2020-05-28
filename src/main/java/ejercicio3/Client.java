package ejercicio3;

public class Client {
    public static void main(String[] args) {
        String aInterpretar = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

        System.out.println("Texto entrada: " + aInterpretar + "." );
        System.out.println("Texto salida: " + new Parser(aInterpretar).evaluate());
    }
}
