import java.util.*;

public class timetableprinter {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Hello welcome to Times Table Printer!\nPlease enter the number: ");
    int n = sc.nextInt();
    for (int i= 1; i<=12; i++){
        System.out.print(n + " X " + i + " = " + n*i);
        System.out.println();
    }

    }
}
