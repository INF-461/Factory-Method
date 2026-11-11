
public class FabriqueProduit {

    public static final String typeA = "A";
    public static final String typeB = "B";
    public static final String typeC = "C";
    public static final String typeD = "D";

    public Produit createProduit(String type) {

        switch (type) {

            case typeA:
                return new ProduitA();

            case typeB:
                return new ProduitB();

            case typeC:
                return new ProduitC();

            case typeD:
                return new ProduitD();

            default:
                throw new IllegalArgumentException(
                    "Type de produit inconnu : " + type
                );
        }
    }
}
