package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int min = array[0];  // on cherche le nombre le plus petit

        for (int i = 1; i < array.length; i++) {  // lecture du tableau
            if (array[i] < min) {  // si l'element est inferieur  à min
                min = array[i];  // alors min prends la valeur de l'element
            }
        }
        System.out.println(" " + min);  // le nombre le plus petit s'affiche

        System.out.println("-----------------------------------------------------");
    }
}
