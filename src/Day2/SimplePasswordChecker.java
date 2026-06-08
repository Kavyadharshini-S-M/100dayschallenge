package Day2;

import java.util.*;

public class SimplePasswordChecker {
    public static void main(String[] args) {
        String password = "789@qwerty";
        int counter = 1;
        int i = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Password: ");
        String input = sc.nextLine();

        while(!input.equals(password) && counter <= 3){
            counter++;
            System.out.print("Try again " + i + " attempts left: ");
            i--;
            input = sc.nextLine();
        }
        if(counter == 3 || i == 0){
            System.out.println("Passwords don't match! Try again after some time");
        }

        if(input.equals(password)){
            System.out.print("Access Granted");
        }
    }
}
