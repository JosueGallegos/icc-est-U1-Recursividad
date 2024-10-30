public class Recursividad {

    public int factorial(int n){
        System.out.println("Calculando el valor de: " + n);
        //caso base : 0! y 1! son iguales a 1
        if(n==0 || n==1){
            System.out.println("Caso base alcanzado el factorial de " + n +" Es 1. ");
            return 1;
            
        }
        int resultado = n * factorial(n-1);
        System.out.println("Resultado parcila para "+ n + " * Factorial ("+ (n-1)+") = "+ resultado);
        return resultado;
        //return n * factrorial(n-1);



    }

    //Calcular la suma de los numeros consecutivos
    //n = 5 resultado 5+4+3+2+1 = 15 

    public int sumaConsecutivos(int n){
        System.out.println("Suma de valores: "+n);
        //caso base
        if(n == 1){
            System.out.println("Caso base de la Suma es "+ n +" Es 1. ");
            return  1;

        }
        //System.out.println("Resultado parcila para "+ n + " * Factorial ("+ (n-1)+") = "+ resultado);
        return n + sumaConsecutivos(n-1);


    }

    //calculrar la potencia de un numero
    public int potencia(int base, int exponente){
        // Caso base
        if(exponente == 0){
            return 1;

        }
        return base * potencia(base, exponente-1);
        

    }

    //Crear un metodo que suma los digitos de un numero 
    //Si mando un 456 sea igual a 16 
    //4+5+6 = 15
    //MOD "%"
    public int sumaDigitos(int numero){
        //Caso base
        if(numero <= 10){
            return numero;

        }
        return numero % 10 + sumaDigitos(numero/10);

    }

    public int fibonacci(int n){
        //Caso base
        if (n == 0)return 0;
        if(n == 1)return 1;

        return fibonacci(n-1)+ fibonacci(n-2);
    }

    


}
