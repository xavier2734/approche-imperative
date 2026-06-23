package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] tab1 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

        int[] somme = new int[tab.length]; // création d'un nouveau tableau : somme

        for (int i = 0; i < tab.length; i++) {   // lecture du tableau
            somme[i] = tab[i] + tab1[i];  // addition des nombres des 2 tableaux et vont dans le nouveau tableau somme


            }
            for (int i = 0; i < somme.length; i++) { // lecture du tableau
                System.out.print(somme[i] + " ");
        }
    }
}
