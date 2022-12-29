package metier;

import metier.IMetier;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl<T> implements IMetier<T> {
    private List<T> listeProduits = new ArrayList<>();

    @Override
    public void add(T o) {
        listeProduits.add(o);
    }

    @Override
    public List<T> getAll() {
        return listeProduits;
    }

    @Override
    public T findById(long id) {
        for (T o : listeProduits) {
            if (Produit.getId() == id) {
                return (T) o;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
            T o = findById(id);
            if (o != null) {
                listeProduits.remove(o);
            }
    }

}

