package Uebung4;

import Uebung4.Hund;




public class Main {
    public static void main(String[] args) {

        System.out.println("Test 1: Konstruktur  mit negativem Alter...");
        try{

            Hund h = new Hund ("aleyandro", -1);

        }catch (HundeAlterInvalide e){
            System.out.println("Exception Handling in Klasse Hund");
            System.out.println(e.getMessage());
        }
        System.out.println("Test 2: Konstruktor und setter mit validem Alter: ");
        try {

            Hund h2 = new Hund("Dino", 23);
        }catch (HundeAlterInvalide e){
            System.out.println("Exception Handling in Klasse Hund:");
            System.out.println(e.getMessage());
        }
        System.out.println("Test 3: Setter mit Negativem alter:...");
        try{
            Hund h3 = new Hund("Tabula",40);
            h3.setAge(-23);
        }catch(HundeAlterInvalide e){
            System.out.println("Exception Handling in Klasse Hund:");
            System.out.println(e.getMessage());
        }
    }
}