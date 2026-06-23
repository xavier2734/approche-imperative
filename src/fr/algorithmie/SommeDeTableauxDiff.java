package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] tab1 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        int tailleMax = Math.max(tab.length, tab1.length); // Prends la taille du plus grand tableau

        int[] somme = new int[tailleMax];  // création d'un nouveau tableau : somme

        for (int i = 0; i < tailleMax; i++) {

            int nombre1 = (i < tab.length) ? tab[i] : 0;  // Si case existe dans le tableau, prends le nombre.
                                                          // Sinon, prends 0.
            int nombre2 = (i < tab1.length) ? tab1[i] : 0;

            somme[i] = nombre1 + nombre2;  //  addition des nombres et stockage dans somme
        }

        System.out.println(" ");

        for (int i = 0; i < somme.length; i++) {
            System.out.print(somme[i] + " ");
        }
    }
}
