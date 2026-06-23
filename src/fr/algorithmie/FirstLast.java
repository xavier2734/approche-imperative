package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] tab = {6, 2, 3, 4, 6};


                       //  tab.length >= 1 --> Le tableau possède au moins une case

        boolean resultat = tab.length >= 1 &&  //  Le tableau contient au moins un élément ET
                                               // le premier élément est égal au dernier élément.
                tab[0] == tab[tab.length - 1]; // le premier nbr 6 et le dernier nbr 6 ont la même valeur, donc true

        System.out.println(resultat);
    }
}
