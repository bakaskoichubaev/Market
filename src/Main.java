import JAVA8.classes.Market;
import JAVA8.classes.Person;
import JAVA8.products.*;
import JAVA8.services.MarketServicesAble;
import JAVA8.services.PersonServicesImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketServicesAble marketServicesAble = new MarketServicesAble();
        PersonServicesImpl personServices = new PersonServicesImpl();
        Person person = new Person("AMAN",30300);
        Market market = new Market("Amazon"," MARKET  24/7",170000,"+996707658666");
        List<BakeryProducts>bakeryProducts = new ArrayList<>(List.of(
                new BakeryProducts("CAKE",20,LocalDate.now(),
                        "Sweet","Kulikovskiy"),
                new BakeryProducts("PIROG",37,LocalDate.now(),"Solenyi ",
                        "Bonjur")
        ));
        marketServicesAble.createBaker(bakeryProducts);
        List<ChildrenFood>childrenFoods = new ArrayList<>(List.of(
                new ChildrenFood ("DIAPERS",450,LocalDate.of(2022,11,4),
                        "huggies","5",100),
                new ChildrenFood("WETWIPES",203,LocalDate.of(2022,12,3),
                        "G&H","gentle",130)
        ));
        marketServicesAble.createChil(childrenFoods);
        List<SeaFood>seafoods= new ArrayList<>(List.of(
                new SeaFood("SALMON",400,LocalDate.now(),"Salmon",
                        "USA",300 ),
                new SeaFood("CRAYFISH",300,LocalDate.of(2022,11,6),"crayfish",
                        "USA",290 )
        ));
        marketServicesAble.createSea(seafoods);
        List<SportFood>sportFoods = new ArrayList<>(List.of(
                new SportFood ("BSA",3000,LocalDate.of(2022,4,3),
                        "25(portions)","ZERO"),
                new SportFood ("PROTEIN",4000,LocalDate.of(2022,3,3),"Power",
                        "ZERO")
        ));
        marketServicesAble.crateSport(sportFoods);
        List<Vegetables> vegetables = new ArrayList<>(List.of(
                new Vegetables("POTATOES",30,LocalDate.now(),"potatoes","KG"),
                new Vegetables("TOMATO",20, LocalDate.now(),"tomato","KG")
        ));
        marketServicesAble.crateVegetables(vegetables);

        System.err.println("WELCOME TO AMAZON");
        while (true){
            System.out.println("       <<<<<<>>>>>>> AMAZON <<<<<<<>>>>>>");
            System.out.println("PRESS 1 TO GO TO THE SECTION BAKERY PRODUCTS");
            System.out.println("PRESS 2 TO GO TO THE SECTION CHILDREN FOOD ");
            System.out.println("PRESS 3 TO GO TO THE SECTION SEA PRODUCTS ");
            System.out.println("PRESS 4 TO GO TO THE SECTION SPORT FOOD ");
            System.out.println("PRESS 5 TO GO TO THE SECTION VEGETABLES ");
            System.out.println("PRESS 6 TO SEE ALL MY PRODUCTS ");
            System.out.println("PRESS 7 TO BUY WHATEVER YOU CHOOSE AND GET A CHECK");
            System.out.println("PRESS 8 TO GET ALL INFORMATION ABOUT THE BUYER");
            System.out.println("PRESS 9 TO GET ALL INFORMATION ABOUT THE MARKET");
            System.out.println("   ");
            System.out.print("PRESS : ");
            int swith = scanner.nextInt();
            switch (swith){
                case 1:
                    System.out.println(marketServicesAble.getAllBakeryProducts());
                    String b = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("THE PRODUCTS NAME : ");
                    String nma = scanner.nextLine();
                    System.out.println(personServices.createProductsBaker(nma.toUpperCase(), marketServicesAble.getAllBakeryProducts(), person, market));
                    break;
                case 2:
                    System.out.println(marketServicesAble.getAllChildrenFoods());
                    String b1 = scanner.nextLine();
                    System.out.println("        ");
                    System.out.print("THE PRODUCTS NAME : ");
                    String nb = scanner.nextLine();
                    System.out.println(personServices.createProductChill(nb.toUpperCase(), marketServicesAble.getAllChildrenFoods(), person, market));
                    break;
                case 3:
                    System.out.println(marketServicesAble.getAllSeaFood());
                    String b2 = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("THE PRODUCTS NAME : ");
                    String nb1 = scanner.nextLine();
                    System.out.println(personServices.createProductsSeaFood(nb1.toUpperCase(), marketServicesAble.getAllSeaFood(), person, market));
                    break;
                case 4:
                    System.out.println(marketServicesAble.getAllSport());
                    String n = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("THE PRODUCTS NAME : ");
                    String nb12 = scanner.nextLine();
                    System.out.println(personServices.createProductsSportFood(nb12.toUpperCase(), marketServicesAble.getAllSport(), person, market));
                    break;
                case 5:
                    System.out.println(marketServicesAble.getAllVegetables());
                    String n1 = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("THE PRODUCTS NAME: ");
                    String nw = scanner.nextLine();
                    System.out.println(personServices.createProductsVegetables(nw.toUpperCase(), marketServicesAble.getAllVegetables(), person, market));
                    break;
                case 6:
                    System.out.println("<<<<< ALL MY PRODUCTS  >>>>>");
                    System.out.println(personServices.getMyProducts());
                    break;
                case 7:
                    personServices.check(market,person);
                    break;
                case 8:
                    System.out.println(person);
                    break;
                case 9:
                    System.out.println(market);
                    break;
                default:
                    System.err.println("ERROR");


            }




        }

    }
}

