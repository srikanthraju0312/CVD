import java.util.Scanner;  //this package is used in taking the number input from user

/**
 * This program takes input of a number and gives its factorial
 */
class factorial{
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int fact = 1; 
        System.out.println("Enter a number: ");
        int a = f.nextInt();
        if(a < 0){
            System.out.println("Sorry!There is no factorial for this number");//because factorial cannot apply for non-negative numbers
        }
        else{
            for(int i=1; i<=a; i++){
                fact = fact*i;
            }
        }
        System.out.println("The factorial of "+a+" is "+fact);
        }
    }
