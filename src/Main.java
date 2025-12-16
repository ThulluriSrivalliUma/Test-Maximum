import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Find Maximum Problem using Generics");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number/word: ");
        String a= sc.next();
        System.out.println("Enter the Second number/word: ");
        String b= sc.next();
        System.out.println("Enter the Third number/word: ");
        String c= sc.next();
        String out= Maximum.FindMax(a,b,c);
        System.out.println(out+" is the maximum number among "+a+","+b+","+c);
    }
}
