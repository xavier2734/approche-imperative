package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int compteur = 0;  // Compteur des éléments communs


        for (int i = 0; i < array1.length; i++) {  // lecture du premier tableau

            for (int j = 0; j < array2.length; j++) {  // lecture du deuxième tableau


                if (array1[i] == array2[j]) {  // Si les deux valeurs sont identiques

                    compteur++;

                    break; // évite de compter en continue
                }
            }
        }

        System.out.println(" " + compteur);
    }
}
