import java.util.Scanner;

public class cube {
    Scanner sc=new Scanner(System.in);
    

    void length(){
        System.out.println("Enter the side lenght");
        double l=sc.nextDouble();
    }

    void area(){
        
    }
    void cal(){
       
        System.out.println("Enter the length  ");
        double length=sc.nextInt();
        double area=6*length*length;
        double volume=length*length*length;
        System.out.println(area);
        System.out.println(volume);

    }

    public static void main(String[] args) {
        cube c=new cube();
        System.out.println("First cube");
        c.cal();
        cube c2=new cube();
        System.out.println("second cube");
        c2.cal();
        cube c3=new cube();
        System.out.println("third cube");
        c3.cal();

    }
}
