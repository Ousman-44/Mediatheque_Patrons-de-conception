package mediatheque;

public class Main {

    public static void main(String[] args) {

        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem(
            new Book("J.R.R. Tolkien", "Le seigneur des anneaux")
        );

        mediatheque.addItem(
            new Book("Philip K. Dick", "Le Maître du haut chateau")
        );

        mediatheque.addItem(
            new CD(12, "Sergeant Peppers")
        );

        System.out.println("=== CATALOGUE COMPLET ===");
        mediatheque.accept(new PrintCatalog());

        System.out.println("\n=== LIVRES UNIQUEMENT ===");
        mediatheque.accept(new PrintOnlyBooksVisitor());

        System.out.println("\n=== CD UNIQUEMENT ===");
        mediatheque.accept(new PrintOnlyCDsVisitor());
    }
}