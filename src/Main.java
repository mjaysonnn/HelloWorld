import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int cases=sc.nextInt();
    while(cases-->0){
        String name= sc.next();
        System.out.println("Hello "+ name + "!");
    }
    sc.close();
}
}
