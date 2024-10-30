public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Recursividad recursividad = new Recursividad();
        //int resultado = recursividad.factorial(5);

        System.out.println(recursividad.factorial(5));
        System.out.println(recursividad.sumaConsecutivos(5));
        System.out.println(recursividad.potencia(5, 2));
        System.out.println(recursividad.sumaDigitos(456));
        System.out.println(recursividad.fibonacci(8));

        RenombrarDirectorios renombrarDirectorios = new RenombrarDirectorios();
        //renombrarDirectorios.renombrarDirectorios("src//App.java");
        renombrarDirectorios.renombrarDirectorios("src//directorios");
    }
}
