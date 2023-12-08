public class Main {
    public static void main(String[] args) {
        int[] newArray = {2, 5, 7, 8, 9, 10 , 0};
        stampaElememti(newArray);
        massimoEMinimo(newArray);
        sommaPari(newArray);

        Docente docente1 = new Docente("Carlo", "Rossi", 5372, 45);
        Docente docente2 = new Docente("Marco", "Rossi", 5372, 43);

        Docente[] array = {docente1, docente2};
        Universita universita = new Universita(array);
        universita.etaMinima();
    }
    public static void stampaElememti (int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void massimoEMinimo (int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (max > j) {
                max = j;
            }
        }
        for (int j : array) {
            if (min < j) {
                min = j;
            }

        }
        System.out.println("valore massimo =" + max);
        System.out.println("valore minimo =" + min);
    }


    public static void sommaPari (int[] array) {
        int somma = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                somma += j;
            }
        }
        System.out.println(somma);
    }
}
