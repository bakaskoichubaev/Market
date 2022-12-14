package JAVA8.services;

import JAVA8.classes.Market;
import JAVA8.classes.Person;
import JAVA8.products.*;

import java.util.ArrayList;
import java.util.List;

public class PersonServicesImpl {
    List<Products>products = new ArrayList<>();
    List<Integer>productSkid = new ArrayList<>();

    public String createProductChill(String product, List<ChildrenFood>products, Person person, Market market ){
        for (ChildrenFood product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getDiscount());
                    market.setBank(market.getBank()+product1.getDiscount());
                    person.setBancAccount(person.getBancAccount()-product1.getDiscount());
                    return "YOU TOOK THIS PRODUCT";
                }else {
                    return "YOU DON'T HAVE MUCH MONEY";
                }

            }
        }
        return "NULL";
    }
    public String createProductsBaker(String product, List<BakeryProducts>products, Person person, Market market ){
        for (Products product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setBank(market.getBank()+product1.getPrice());
                    person.setBancAccount(person.getBancAccount()-product1.getPrice());
                    return "YOU TOOK THIS PRODUCT";
                }else {
                    return "YOU DON'T HAVE MUCH MONEY";
                }

            }
        }
        return "NULL";
    }

    public String createProductsSeaFood(String product, List<SeaFood>products, Person person, Market market ){
        for (SeaFood product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    market.setBank(market.getBank()+product1.getSkidka());
                    this.productSkid.add(product1.getSkidka());
                    person.setBancAccount(person.getBancAccount()-product1.getSkidka());
                    return "YOU TOOK THIS PRODUCT";
                }else {
                    return "YOU DON'T HAVE MUCH MONEY";
                }

            }
        }
        return "NULL";
    }
    public String createProductsSportFood(String product, List<SportFood>products, Person person, Market market ){
        for (Products product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setBank(market.getBank()+product1.getPrice());
                    person.setBancAccount(person.getBancAccount()-product1.getPrice());
                    return "YOU TOOK THIS PRODUCT";
                }else {
                    return "YOU DON'T HAVE MUCH MONEY";
                }

            }
        }
        return "NULL";
    }

    public String createProductsVegetables(String product, List<Vegetables>products, Person person, Market market ){
        for (Products product1 : products) {
            if(product1.getName().equals(product)){
                if(product1.getPrice()<=person.getBancAccount()){
                    this.products.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setBank(market.getBank()+product1.getPrice());
                    person.setBancAccount(person.getBancAccount()-product1.getPrice());
                    return "YOU TOOK THIS PRODUCT";
                }else {
                    return "YOU DON'T HAVE MUCH MONEY";
                }

            }
        }
        return "NULL";
    }
    public List<Products>getMyProducts(){
        return this.products;
    }
    public void check(Market market,Person person){
        int total = 0;
        int skid = 0;
        for (Integer product : this.productSkid) {
            total+=product;
        }
        for (Products product : products) {
            skid+=product.getPrice();
        }
        System.out.println("    ");
        System.out.println("<<<<<<<<<< CHACK AMAZON   >>>>>>>>>");
        System.out.println("НАЗВАНИЕ МАРКЕТА : "+ market.getName());
        System.out.println("ИМЯ ЧЕЛОВЕКА "+person.getName());
        System.out.println(this.products);
        System.out.println("TOTAL PRICE  "+skid);
        System.out.println("PRICE AFTER DISCOUNT : "+total);
        System.out.println("    ");


    }}