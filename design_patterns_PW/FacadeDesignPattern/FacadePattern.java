// Facade Design Pattern 

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

interface MobileShop {
  public void modelNo();
  public void price();
}

class Iphone implements MobileShop {
  @Override
  public void modelNo(){
    System.out.println("Iphone 16 Pro max");
  }
  
  @Override
  public void price(){
    System.out.println("Rs 95,000");
  }
}

class Samsung implements MobileShop {
  @Override
  public void modelNo() {
    System.out.println("Samsung S24 Ultra");
  }
  
  @Override
  public void price() {
    System.out.println("Rs 86,0000");
  }
}

class Blackberry implements MobileShop {
  @Override
  public void modelNo() {
    System.out.println("Blackberry Z10");
  }
  
  @Override
  public void price() {
    System.out.println("Rs 55,000");
  }
}

class Shopkeeper {
  private MobileShop iphone;
  private MobileShop samsung;
  private MobileShop blackberry;
  
  public Shopkeeper() {
    iphone = new Iphone();
    samsung = new Samsung();
    blackberry = new Blackberry();
  }
  
  public void iphoneSale() {
    iphone.modelNo();
    iphone.price();
  }
  
  public void samsungSale() {
    samsung.modelNo();
    samsung.price();
  }
  
  public void blackberrySale() {
    blackberry.modelNo();
    blackberry.price();
  }
  
}

class Main {
  
  // Choice of the customer
  private static int choice;
  
  public static void main(String args[]) throws NumberFormatException, IOException {
    do {
      System.out.println("====================== Mobile Shop ========================= \n");
      System.out.println("  1. IPHONE.   \n");
      System.out.println("  2. SAMSUNG. \n");
      System.out.println("  3. BLACKBERRY \n");
      System.out.println("  4. EXIT      \n");
      System.out.println(" Enter your choice: ");
      
      // Read user input 
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      choice = Integer.parseInt(br.readLine());
      
      Shopkeeper sk = new Shopkeeper();
      
      switch(choice){
        case 1: 
          {
            sk.iphoneSale();
          }
          break;
        case 2:
          {
            sk.samsungSale();
          }
          break;
        case 3:
          {
            sk.blackberrySale();
          }
          break;
        default: 
          {
            System.out.println("Nothing to purchase");
          }
        
        return;
      } 
    }while(choice!=4);
      
  }
  
   
}
