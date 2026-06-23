package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int somme = 0;  // creation de la variable : somme égal 0

        for (int i = 0; i < array.length; i++) {
            somme += array[i];  // c'est egal à : somme = somme + array[i];
        }

        double moyenne = (double) somme / array.length;  // (double) permet d'obtenir des décimales en divisant

        System.out.println(" " + moyenne);
    }
}
