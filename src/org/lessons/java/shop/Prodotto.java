package org.lessons.java.shop;
public class Prodotto {
    private int code;
    private String name;
    private String description;
    private float price;
    private int iva;
    private float ivaPrice;

    public Prodotto(){
        this.code = (int)(Math.random() * 100000) + 1; 
    }

    public Prodotto(int price, int iva, String name){
        this.code = (int)(Math.random() * 100000) + 1;
        this.price = price;
        this.iva = iva;
        this.name = name;
    }

    /* public void basePrice(){

        System.out.println(this.price);
    } */

    public void ivaPrice(){
       this.ivaPrice = this.price + ((this.price * this.iva)/100);
       System.out.println(ivaPrice);
    }
     

    public void completeName(){
        System.out.println(code+"-"+name);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setdescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }
    
    public void setIva(int iva){
        this.iva = iva;
    }


    public int getIva(){
        return iva;
    }

    public int getCode(){
        return code;
    }
}
