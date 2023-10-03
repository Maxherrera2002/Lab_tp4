import java.util.Random;
import java.util.Scanner;

public class tp_4_java {
    public static void main(String[] args) {
        //Ehjercicio 1
        Scanner leer = new Scanner(System.in);

        int numbers[] = new int[10];
        double medium = 0;//para sacar media
        double medium_ = 0;//para sacar media impares
        double medium__ = 0;//para sacar media pares
        int aux = 0, aux_ = 0;//aux es para contar la cantidad de numeros impares ingresados, aux_ para los pares
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("ingresar numero");
            numbers[i] = leer.nextInt();
            medium += numbers[i];
            if (numbers[i] < 0) {
                medium_ += numbers[i];
                aux += 1;
            } else if (numbers[i] > 0) {
                medium__ += numbers[i];
                aux_ += 1;
            }
        }
        medium /= 10;
        System.out.println("La media de todos los numeros es: " + medium);
        if (medium_ != 0) {
            medium_ /= aux;
            System.out.println("La media de los numeros negativos es de; " + medium_);
        } else {
            System.out.println("No hay numeros negativos");
        }
        if (medium__ != 0) {
            medium__ /= aux_;
            System.out.println("La media de numeros positivos es de: " + medium__);
        } else {
            System.out.println("No hay numeros positivos");
        }
        //Ejercicio2
        int numeros[] = new int[10];
        medium = 0;//para guardar la media de los pares
        aux = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresar numero");
            numeros[i] = leer.nextInt();
            if ((i) % 2 == 0 || i == 0) {
                medium += numeros[i];
                aux += 1;
            }
        }
        medium /= aux;
        System.out.println("La media de las posiciones pares es: " + medium);
        ;
        //Ejercicio3
        medium = 0;//se guarda la nota media
        double cannota[];
        System.out.println("Ingresar cantidad de notas");
        int notas = leer.nextInt();//cantidad de notas
        cannota = new double[notas];
        for (int i = 0; i < cannota.length; i++) {
            System.out.println("ingresar nota " + (i + 1));
            cannota[i] = leer.nextDouble();
            medium += cannota[i];
        }
        medium /= cannota.length;
        System.out.println("La media de las notas es: " + medium);
        System.out.println("Las notas superiores al promedio fueron");
        for (int i = 0; i < cannota.length; i++) {
            if (cannota[i] > medium) {
                System.out.println("nota: " + cannota[i]);
            }
        }
        //Ejercicio 4
        int pares[] = new int[20];
        for (int i = 0; i < pares.length; i++) {
            while (true) {
                System.out.println("Ingresar nuemero");
                aux = leer.nextInt();
                if ((aux % 2) == 0) {
                    pares[i] = aux;
                    break;
                }
            }
        }
        System.out.print("Los primeros 20 numeros pares fueron: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(":" + pares[i]);
        }
        System.out.println("");
        //Ejercicio 5
        int numeros_[] = new int[10];
        int posi = 0, neg = 0, cero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresar numero");
            numeros_[i] = leer.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            if (numeros_[i] > 0) {
                posi += 1;
            } else if (numeros_[i] < 0) {
                neg += 1;
            } else {
                cero += 1;
            }
        }
        System.out.println("La cantidad de numeros positivos encontrada fue de: " + posi);
        System.out.println("La cantidad de numeros negativos encontrada fue de: " + neg);
        System.out.println("La cantidad de ceros encontrados fue de: " + cero);
        //Ejercicio 6
        int nums[] = new int[10];
        medium = 0;
        medium_ = 0;
        aux = 0;
        aux_ = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresar numero");
            nums[i] = leer.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nums[i] > 0) {
                medium += nums[i];
                aux += 1;
            } else if (nums[i] < 0) {
                medium_ += nums[i];
                aux_ += 1;
            }
        }
        if (medium != 0) {
            medium /= aux;
            System.out.println("La media de numeros positivos es de: " + medium);
        } else {
            System.out.println("No se encontraron numerops positivos");
        }
        if (medium_ != 0) {
            medium_ /= aux_;
            System.out.println("la media de numeros negativos es de: " + medium_);
        } else {
            System.out.println("no se encontraron numeros negativos");
        }

        //Ejercicio 7
        medium = 0;
        aux = 0; //cantidad de persona superiores al promedio
        aux_ = 0; //cantidad de persona inferior al promedio
        int can;
        System.out.println("ingresar cantidad de personas a medir");
        can = leer.nextInt();
        double personas[] = new double[can];
        for (int i = 0; i < personas.length; i++) {
            System.out.println("ingresar altura persona");
            personas[i] = leer.nextDouble();
        }
        for (int i = 0; i < personas.length; i++) {
            medium += personas[i];
        }
        if (medium != 0) {
            medium /= personas.length;
            System.out.println("La media de altura de las personas medidas es de: " + medium);
        }
        for (int i = 0; i < personas.length; i++) {
            if (medium < personas[i]) {
                aux += 1;
            } else if (medium > personas[i]) {
                aux_ += 1;
            }
        }
        System.out.println("La cantidad de personas superior al promedio es de: " + aux);
        System.out.println("La cantidad de personas inferiores a la media es de: " + aux_);
        //Ejercicio 8
            ejercicio8();
        //Ejercicio 9
            int desde, hasta, numArray;
            Scanner sc = new Scanner(System.in);
            System.out.print("Introdusca desde que numero quiere llenar el array(random): ");
            desde = sc.nextInt();
            System.out.print("Introdusca hasta que numero quiere llenar el array(random): ");
            hasta = sc.nextInt();
            System.out.print("Itrodusca el tamaño del array: ");
            numArray = sc.nextInt();
            int[] resultado = ejercicio9(desde, hasta, numArray);
            for (int valor : resultado) {
                System.out.println(valor);
            }
        //Ejercicio 10
             ejercicio10();
        //Ejercicio 11
             ejercicio11();
    }


    public static void ejercicio8() {
        String empleadoWrite;
        String[] empleados = new String[10];
        int[] sueldo = new int[10];
        Scanner sc = new Scanner(System.in);
        int auxSueldo = 0;
        String auxEmpleado = "";

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Introduzca el nombre del empleado: ");
            empleadoWrite = sc.nextLine();
            System.out.print("Introduzca el sueldo del empleado: ");
            sueldo[i] = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea pendiente
            empleados[i] = empleadoWrite;

            if (sueldo[i] > auxSueldo) {
                auxSueldo = sueldo[i];
                auxEmpleado = empleadoWrite;
            }
        }

        System.out.println("El empleado con el sueldo más alto es: " + auxEmpleado + " con un sueldo de: " + auxSueldo);
    }

    public static int[] ejercicio9(int desde, int hasta, int numArray) {
        Random rand = new Random();
        int[] arrayPlus = new int[numArray];
        for (int i = 0; i < arrayPlus.length; i++) {
            int random = rand.nextInt(hasta - desde + 1) + desde;
            arrayPlus[i] = random;
        }
        return arrayPlus;

    }


    public static void ejercicio10() {
        // A y B
        int filaA, columnaA, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdusca las filas de la primera matriz: ");
        filaA = sc.nextInt();
        System.out.print("Introdusca las columnas de la primera matriz: ");
        columnaA = sc.nextInt();
        int[][] matrizA = new int[filaA][columnaA];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Introdusca un numero para la matriz A: ");
                num = sc.nextInt();
                matrizA[i][j] = num;
            }
        }
        int[][] matrizB = new int[filaA][columnaA];
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print("Introdusca un numero para la matriz B: ");
                num = sc.nextInt();
                matrizB[i][j] = num;
            }
        }
        //Mostramos por pantalla las matrices a y b
        System.out.println("Matriz A");
        for (int z = 0; z < matrizA.length; z++) {
            for (int x = 0; x < matrizA[z].length; x++) {
                System.out.print(matrizA[z][x] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz B");
        for (int z = 0; z < matrizB.length; z++) {
            for (int x = 0; x < matrizB[z].length; x++) {
                System.out.print(matrizB[z][x] + "\t");
            }
            System.out.println();
        }
        //Sumamos las matrices
        int[][] matrizC = new int[columnaA][filaA];
        for (int f = 0; f < matrizA.length; f++) {
            for (int c = 0; c < matrizA[f].length; c++) {
                matrizC[f][c] = matrizA[c][f]+matrizB[c][f];
            }
        }
        //Mostramos la suma de matrices
        System.out.println("Matriz C:");
        for (int z = 0; z < matrizC.length; z++) {
            for (int x = 0; x < matrizC[z].length; x++) {
                System.out.print(matrizC[z][x] + "\t");
            }
            System.out.println();
        }
    }

    public static void ejercicio11(){
        int fila, columna, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdusca las filas de la matriz: ");
        fila = sc.nextInt();
        System.out.print("Introdusca las columnas de la matriz: ");
        columna = sc.nextInt();
        int[][] matrizA = new int[fila][columna];
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                System.out.print("Introdusca un numero: ");
                num = sc.nextInt();
                matrizA[i][j] = num;
            }
        }
        int[][] matrizAT = new int[columna][fila];
        for (int f = 0; f < matrizA.length; f++) {
            for (int c = 0; c < matrizA[f].length; c++) {
                matrizAT[c][f] = matrizA[f][c];
            }
        }

        for (int z = 0; z < matrizA.length; z++) {
            for (int x = 0; x < matrizA[z].length; x++) {
                System.out.print(matrizA[z][x] + "\t"); // Imprime el elemento y un tabulador
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        System.out.println("MATRIZ 2");
        for (int z = 0; z < matrizAT.length; z++) {
            for (int x = 0; x < matrizAT[z].length; x++) {
                System.out.print(matrizAT[z][x] + "\t"); // Imprime el elemento y un tabulador
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }


}