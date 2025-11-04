package org.example.model;

public class Chocolate extends ProductForSale {
    // Sınıfa özgü en az bir değişken
    private int cocoaPercent; // % kakao oranı

    public Chocolate(String type, double price, String description, int cocoaPercent) {
        super(type, price, description);
        this.cocoaPercent = cocoaPercent;
    }

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.cocoaPercent = 60;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün: " + getType());
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Birim Fiyat: " + getPrice());
        System.out.println("Kakao Oranı: %" + cocoaPercent);
        System.out.println("-----------------------------");
    }
}