package metier;

public class Produit {
    private static int id;
    private static String nom;
    private static String marque;
    private static double prix;
    private static String description;
    private static int nombreEnStock;


    public Produit(int id, String nom, String marque, double prix, String description, int nombreEnStock){
        this.id=id;
        this.nom=nom;
        this.marque=marque;
        this.prix=prix;
        this.description=description;
        this.nombreEnStock=nombreEnStock;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public static double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getNombreEnStock() {
        return nombreEnStock;
    }

    public void setNombreEnStock(int nombreEnStock) {
        this.nombreEnStock = nombreEnStock;
    }
}
