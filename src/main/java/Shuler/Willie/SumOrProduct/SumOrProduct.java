package Shuler.Willie.SumOrProduct;

import java.util.Scanner;

/**
 * Created by willieshuler on 9/9/16.
 */
public class SumOrProduct {

    public int getNumber() {
        System.out.println("Enter a number: ");
        Scanner userInput = new Scanner(System.in);
        int usersInput = userInput.nextInt();
        return usersInput;
    }

    public String getMethod(){
        System.out.println("Method of Operation: Sum or Product? ");
        Scanner userInput = new Scanner (System.in);
        String methodInput = userInput.next();
        return  methodInput;

    }

    public int addMethod(int number){
        int sum =0;
        for(int i=1; i <= number; i++ ){
            sum = sum + i;
        }
        return sum;
    }

    public int productMethod(int number){
        int sum =0;
        for(int i=1; i <= number; i++ ){
            sum = sum * i;
        }
        return sum;
    }

    public static void main (String[] args){

        SumOrProduct sumOrProduct = new SumOrProduct();

        int number = sumOrProduct.getNumber();

        String method = sumOrProduct.getMethod();

        if (method.equalsIgnoreCase("sum")){
           int addTotal = sumOrProduct.addMethod(number);
            System.out.println("You have chosen the Sum Method, Your total is: " + addTotal);
        }

        else if (method.equalsIgnoreCase("product")){
           int productTotal = sumOrProduct.productMethod(number);
            System.out.println("You have chosen the Prodcut Method, Your total is: " + productTotal);
        }
    }
}