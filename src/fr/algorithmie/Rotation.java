package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {

        int[] tab = {0, 1, 2, 3};

        // on va cherché le dernier nombre du tableau qui est représenté par  -->  tab[tab.length - 1]
        int dernier = tab[tab.length - 1];

        // Lecture du tableau de la fin vers le début , i-- --> Enlève 1 à i
        for (int i = tab.length - 1; i > 0; i--) {
            tab[i] = tab[i - 1];  // La case de droite copie la valeur de la case de gauche
                                  // La case i reçoit la valeur contenue dans la case i - 1
                                  /* à gauche du = ➜ l'endroit où on écrit
                                     à droite du = ➜ ce qu'on lit/copie*/

        }
        tab[0] = dernier;  // dernier nombre au début

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
/*EXERCICE ROTATION
• Créer une classe Rotation
• Dans cette classe, on déclare un tableau d’entiers
• Effectuez une rotation à droite des éléments.
• Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}*/