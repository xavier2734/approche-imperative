package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        while (nbBig > 0 && longueur >= 5) {
            longueur = longueur - 5;
            nbBig = nbBig - 1;
        }

        // on finit avec les briques de 1
        if (nbSmall >= longueur) {
            return true;
        } else {
            return false;
        }
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
    {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
    }
}
//ou
/*static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {

    // on utilise d'abord les briques de 5
    int maxBigUtilisables = Math.min(nbBig, longueur / 5);
    longueur = longueur - (maxBigUtilisables * 5);

    // ensuite on vérifie si les briques de 1 suffisent
    boolean resultat = (nbSmall >= longueur);

    return resultat;
}*/


