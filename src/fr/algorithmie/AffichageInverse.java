package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {

        //tableau

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        //Afficher le tableau avec for dans l'ordre
        for (int i = 0; i < array.length; i++) { // array.length -> la longueur du tableau
            System.out.println(array[i]);
        }
        System.out.println("-----------------------------------------------------");
        //Afficher le tableau avec for dans l’ordre inverse
        for (int i = array.length - 1; i >= 0; i--) { // -1 -> derniere case du tableau et i-- -> -1 à chaque tour
            System.out.println(array[i]);
        }
        System.out.println("-----------------------------------------------------");


        int[] arrayCopy = new int[array.length];  // copie du tableau avec le même nbrs de cases
        for (int i = 0; i < array.length; i++) { // lecture d'une case après l'autre
            arrayCopy[i] = array[i]; // confirme la copie des 2 tableaux
            System.out.println(array[i]);
        }
    }
}
