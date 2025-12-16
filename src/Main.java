import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Find Maximum Problem using Generics");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Float a= sc.nextFloat();
        System.out.println("Enter the Second number: ");
        Float b= sc.nextFloat();
        System.out.println("Enter the Third number: ");
        Float c= sc.nextFloat();
        Float out=IntMax.FindMax(a,b,c);
        System.out.println(out+" is the maximum number among "+a+","+b+","+c);
    }
}
