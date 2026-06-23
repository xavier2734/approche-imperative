package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int max = array[0];  // on cherche le nombre le plus grand

        for (int i = 1; i < array.length; i++) {  // lecture du tableau
            if (array[i] > max) {  // si l'element est superieur à max
                max = array[i];     // alors max prends la valeur de l'element
            }
        }
        System.out.println(" " + max);  // le nombre le plus grand s'affiche

        System.out.println("-----------------------------------------------------");

    }
}
