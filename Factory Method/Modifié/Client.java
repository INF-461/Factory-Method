
public class Client {

    public static void main(String[] args) {

        System.out.println("=== TEST DU PATRON FACTORY METHOD ===");

        FabriqueProduit fabriqueproduit = new FabriqueProduit();

        Produit produit;

        // Produit A
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();

        // Produit B
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();

        // Produit C
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();

        // Produit D
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeD);
        produit.methodeproduit();

        // Test d'un produit inexistant
        try {
            produit = fabriqueproduit.createProduit("X");
            produit.methodeproduit();

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur contrôlée : " + e.getMessage());
        }

        System.out.println("=== FIN DES TESTS ===");
    }
}
