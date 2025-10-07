package org.lessons.java.shop;
public class Prodotto {
    public int code;
    public String name;
    public String description;
    public float price;
    public int iva;
    public float ivaPrice;

    public Prodotto(int price, int iva, String name){
        this.code = (int)(Math.random() * 100000) + 1; 
        this.price = price;
        this.iva = iva;
        this.name = name;
    }

    public void basePrice(){
        System.out.println(this.price);
    }

    public void ivaPrice(){
       this.ivaPrice = this.price + ((this.price * this.iva)/100);
       System.out.println(ivaPrice);
    }

    public void completeName(){
        System.out.println(code+"-"+name);
    }
}
