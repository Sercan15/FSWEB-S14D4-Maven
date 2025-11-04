package org.example.model;

public class Coke extends ProductForSale {
    // Sınıfa özgü en az bir değişken
    private int volumeMl;     // hacim (ml)
    private boolean diet;     // diyet mi

    public Coke(String type, double price, String description, int volumeMl, boolean diet) {
        super(type, price, description);
        this.volumeMl = volumeMl;
        this.diet = diet;
    }

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.volumeMl = 330;
        this.diet = false;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün: " + getType());
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Birim Fiyat: " + getPrice());
        System.out.println("Hacim: " + volumeMl + " ml");
        System.out.println("Diyet: " + (diet ? "Evet" : "Hayır"));
        System.out.println("-----------------------------");
    }
}