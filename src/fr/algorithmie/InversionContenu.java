package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {

        // Tableau inversé

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int[] arrayCopy = new int[array.length];  // copie du tableau avec le même nbrs de cases
        for (int i = 0; i < array.length; i++) { // -1 -> derniere case du tableau et i-- -> -1 à chaque tour
            // Pour i qui commence à 0, tant que i est plus petit que la taille du tableau,
            // on augmente i de 1 à chaque tour
            arrayCopy[i] = array[array.length - 1 - i];

        }

        System.out.println(" ");
        for (int valeur : array) {
            System.out.print(valeur + " ");
        }

        System.out.println(" ");
        for (int valeur : arrayCopy) {
            System.out.print(valeur + " ");

        }

    }
}

