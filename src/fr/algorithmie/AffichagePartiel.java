package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {

        // Affichage partiel

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

       for (int i = 1; i < array.length; i++) {
           if (array[i] > 3) {      // on cherche les chiffres supérieur à 3
               System.out.println(array[i] + " ");
           }
       }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {       // on cherche les chiffres pairs avec modulo
                System.out.println(array[i] + " ");
            }
        }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {  // on cherche les chiffres impairs avec modulo et
                                        // la conditionn !-->( si Différent (non égal)
                System.out.println(array[i] + " ");
            }
        }

        System.out.println("\n");
    }


}
