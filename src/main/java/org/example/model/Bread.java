package org.example.model;

public class Bread extends ProductForSale {

    private int weightGr;
    private boolean wholeWheat;

    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.weightGr = 400;
        this.wholeWheat = false;
    }

    public Bread(String type, double price, String description, int weightGr, boolean wholeWheat) {
        super(type, price, description);
        this.weightGr = weightGr;
        this.wholeWheat = wholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün: " + getType());
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Birim Fiyat: " + getPrice());
        System.out.println("Ağırlık: " + weightGr + " gr");
        System.out.println("Tam Buğday: " + (wholeWheat ? "Evet" : "Hayır"));
        System.out.println("-----------------------------");
    }
}