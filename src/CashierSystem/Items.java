package CashierSystem;

import java.util.List;

public class Items {

    private int id;
    private String name;
    private List<Variants> variants;

    public Items() {
    }

    public Items(int id, String name, List<Variants> variants) {
        this.id = id;
        this.name = name;
        this.variants = variants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Variants> getVariants() {
        return variants;
    }

    public void setVariants(List<Variants> variants) {
        this.variants = variants;
    }
}
