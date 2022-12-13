package JAVA8.services;

import JAVA8.products.*;

import java.util.ArrayList;
import java.util.List;

public class MarketServicesAble {
    List<BakeryProducts>bakeryProducts = new ArrayList<>();
    List<ChildrenFood>childrenFoods = new ArrayList<>();
    List<SeaFood> seafoods = new ArrayList<>();
    List<SportFood> sportFoods = new ArrayList<>();
    List<Vegetables> vegetables = new ArrayList<>();

    public String createBaker(List<BakeryProducts>bakeryProducts){
        this.bakeryProducts.addAll(bakeryProducts);
        return "";}
    public  List<BakeryProducts>getAllBakeryProducts(){return this.bakeryProducts;}


    public String createChil(List<ChildrenFood>childrenFoods){
        this.childrenFoods.addAll(childrenFoods);
        return "";}
    public List<ChildrenFood>getAllChildrenFoods(){return this.childrenFoods;}


    public String createSea(List<SeaFood>seafoods){
        this.seafoods.addAll(seafoods);
        return "";}
    public  List<SeaFood>getAllSeaFood(){return this.seafoods;}


    public String crateSport(List<SportFood>sportFoods){
        this.sportFoods.addAll(sportFoods);
        return "";}
    public List<SportFood>getAllSport(){ return this.sportFoods;}


    public String crateVegetables(List<Vegetables>vegetables){
        this.vegetables.addAll(vegetables);
        return "";}
    public List<Vegetables>getAllVegetables(){return this.vegetables;}






}