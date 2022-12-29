package App;

import metier.*;

import java.util.Scanner;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");
            System.out.print("Choisissez une option: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    List<String> products = metier.getAll();
                    if (products.isEmpty()) {
                        System.out.println("La liste est vide.");
                    } else {
                        for (String o : products) {
                            System.out.println(Produit.getId() + " - " +Produit.getNom() + " - " + Produit.getMarque() + " - " + Produit.getPrix());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Entrez l'id du produit à rechercher: ");
                    long id = sc.nextLong();
                    Integer o = (Integer) metier.findById(id);
                    if (o != null) {
                        System.out.println(Produit.getId() + " - " + Produit.getNom() + " - " + Produit.getMarque() + " - " + Produit.getPrix());
                    } else {
                        System.out.println("Le produit n'a pas été trouvé.");
                    }
                    break;
                case 3:
                    System.out.print("Entrez le nom du produit: ");
                    String nom = sc.nextLine();
                    System.out.print("Entrez la marque du produit: ");
                    String marque = sc.nextLine();
                    System.out.print("Entrez le prix du produit: ");
                    double prix = sc.nextDouble();
                    System.out.print("Entrez la description du produit: ");
                    sc.nextLine();
                    String description = sc.nextLine();
                    System.out.print("Entrez le nombre en stock du produit: ");
                    int NombreEnStock = sc.nextInt();

            }
        }
    }}
