package co.edu.utp.misiontic2022.c2;
import java.util.Scanner; 

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        //EJERCICIO 1
        System.out.println(NumeroDeLaSuerte("27/04/1996"));
        /** EJERCICIO 2
         * PIDIENDO LOS DATOS
        double precioUnidad, cantidad, iva, precioSinIva, totalIva;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca precio por unidad del producto: ");                                          
        precioUnidad = sc.nextDouble();
        System.out.print("Introduzca número de productos vendidos: ");
        cantidad = sc.nextDouble();
        System.out.print("Introduzca %IVA: ");
        iva = sc.nextDouble();
        */
        /** LLAMANDO LAS VARIABLES
        double pu=8000;
        int c=10;
        double iva=16;
        System.out.println(IVA(pu, c, iva));
        TENIENDO LOS DATOS
        System.out.println(IVA(8000, 10, 16));*/
    

        /** EJERCICIO TRES introduzco info
        int N, m;
        Scanner sc = new Scanner(System.in);    
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        System.out.print("Introduzca valor de m: ");
        m = sc.nextInt();
        //LA INFO YA ESTA SEÑALADA
        System.out.print(numeroSinU(123456,2));
        
        // CUARTO EJERCICIO 
        double Km;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca velocidad en Km/h: ");
        Km = sc.nextDouble();
        
        double Km=600;
        System.out.println("La conversión de la velocidad " +Km + " en Km/h, en m/S es: "+ DKmaM(Km));*/
        
        
        //QUINTO EJERCICIO
        /**double cateto1=10.5, cateto2=52.2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca longitud del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo cateto: ");
        cateto2 = sc.nextDouble();*/
        //System.out.println("La hipotenusa es: "+Pitagoras(cateto1, cateto2));
        
        //SEXTO EJERCICIO
        //int num=32;
        /**Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        N = sc.nextInt();*/
        //System.out.println(num+" "+MultiD(num));

        //SEPTIMO EJERCICIO 
        //char c='Y';
        /** System.out.print("Introduzca un carácter: ");
        car = (char) System.in.read(); //lee un solo caracter
        */
        //System.out.println(c+" "+Caracter(c));
        
        //OCTAVO EJERCICIO
        double n1=10, n2=0;
        /** Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dividendo: ");
        n1 = sc.nextDouble();
        System.out.print("Introduzca el divisor: ");
        n2 = sc.nextDouble();*/
        System.out.println(DivisionNumeros(n1,n2));

        


    }
    //EJERCICIO 1
    public static int NumeroDeLaSuerte(String FN){ //FN es Fecha de Nacimiento
        //27/04/1996
        var indice=FN.indexOf('/');//devuelve la posición, del caracter, por medio de un entero, si no existe devuelve -1
        //Integer.parseInt convierte una cadena a entero primitivo
        //substring Devuelve una subcadena, contenida entre beginIndex y endIndex. 
        //si no esta endIndex, se asumirá como el final de la cadena.
        //substring(beginIndex, endIndex)
        var dia=Integer.parseInt(FN.substring(0, indice));
        var indiceM=FN.indexOf('/',++indice); 
        //EN EL PRIMER CASO indice se reiere a la posición 0 y .indexOf hasta llegar a / dentro de FN
        //luego dice entre / y / para mes ++indice una posicióndespues de donde encontro el primer /
        var mes=Integer.parseInt(FN.substring(indice, indiceM++));
        var a=Integer.parseInt(FN.substring(indiceM));

        var ns1= dia + mes +a;
        //2027
        var ns=0;
        while (ns1 != 0){
            // si 2027 es mayor que 0 aplique el modulo de 10 (osea que la división me de exacta)
            // 2027%10 osea me devuelve el residuo 
            ns+=ns1%10;
            ns1 /=10;

        }

        return ns;
    }
    //EJERCICIO 2
    public static double IVA(double pu, int c, double iva){
        
        var precioSinIva = pu * c;
        var totalIva = precioSinIva * iva / 100;
        var totalPagar = precioSinIva + totalIva;   
        return totalPagar;                                 
    }
    //EJERCICIO 3 ? DUDA
    public static int numeroSinU(int N, int m){
       
        var r=(int)Math.pow(10,m); //MATH.POW ES EL METODO MATEMATICO DE POTENCIA 
        var NN = N / r; 
        //Math.pow devuelve un número de tipo double                 
        //es necesario convertirlo a int para hacer la                                                  
        //división entre enteros
        return NN;
    }
    public static double DKmaM(double Km)
    {
        var M=Km*1000/3600;
        return M;
          
    }
    public static double Pitagoras(double cateto1, double cateto2)
    {
        var h= Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
        return h;
    }
    public static String MultiD(int num)
    {
        String a;
        if(num%10==0){
            a="Es múltiplo de 10"; 
        }   
        else{
            a="No es múltiplo de 10";
        }  
    return a;
    }
    public static String Caracter(char c)
    {
        String salida;
        if (Character.isUpperCase(c)) 
        //método isUpperCase de la clase Character 
        //determina si el valor de carácter especificado está en mayúsculas       
        {
            salida="Es una letra mayúscula";
        } else {
            salida="No es una letra mayúscula";
        }
        return salida;
    }
    public static String DivisionNumeros(double n1, double n2)
    {
        String e;
        if(n2==0){
           e="No se puede dividir por cero";   
        }else{
           e=n1 + " / " + n2 + " = " +n1/n2;       
        }
        return e;
    }
   
    
}


