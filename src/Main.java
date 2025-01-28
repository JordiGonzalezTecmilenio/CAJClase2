public class Main {
    public static void main(String[] args) {

        //If
        int numero = 1;
        if(numero > 5)
        {
            System.out.println("El numero es mayor");
        }
        else
        {
            System.out.println("El numero es menor");
        }

        System.out.println("Esto es un for:");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Esto es un switch:");

        char letra = 'D';

        switch (letra)
        {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
        }

        //while
        System.out.println("Cuenta regresiva");
        int contador = 10;
        while(contador > 0)
        {
            contador--;
            System.out.println(contador);
        }

        //Ejemplo de Do-While
        System.out.println("Imprimir al menos una vez");
        int numero2 = 0;
        do
        {
            System.out.println(numero2);
            numero2++;
        }
        while (numero2 < 10);
    }
}