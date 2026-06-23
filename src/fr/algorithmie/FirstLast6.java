package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] tab = {6, 2, 3, 4, 5};


        // Si le tableau contient au moins un élément ET que le premier élément OU le dernier élément vaut 6,
        // alors resultat vaut true, sinon il vaut false
        // tab.length > 0 ET (tab[0] == 6 OU tab[tab.length - 1] == 6).

        boolean resultat = tab.length > 0 &&               //   && Vérifie que toutes les conditions sont réalisées
                (tab[0] == 6 || tab[tab.length - 1] == 6); //   == Compare deux valeurs et vérifie leur égalité
                                                           //   ||Vérifie qu'une des conditions est réalisée
        System.out.println(resultat);
    }
}
