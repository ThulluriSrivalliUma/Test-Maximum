import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Find Maximum Problem using Generics");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Integer a= sc.nextInt();
        System.out.println("Enter the Second number: ");
        Integer b= sc.nextInt();
        System.out.println("Enter the Third number: ");
        Integer c= sc.nextInt();
        Integer out=IntMax.FindMax(a,b,c);
        System.out.println(out+" is the maximum number among "+a+","+b+","+c);
    }
}
