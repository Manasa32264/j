import java.util.Scanner;

public class cube {
    Scanner sc=new Scanner(System.in);
    double l[]=new double[3];
        double area[]=new double[3];
        double volume[]=new double[3];
    

    void cal(){
        
      //=0 int cube[]=new int[3];
       for(int i=0;i<3;i++){
        System.out.println("Cube-"+(i+1));
        System.out.println("ENter the length");
        l[i]=sc.nextDouble();
        area[i]=6*l[i]*l[i];
        volume[i]=l[i]*l[i]*l[i];
      

       }
       

    }

    void display(){
        for(int i=0;i<3;i++){
           System.out.println("Area of cube "+(i+1)+" is "+area[i]+" and volume is "+volume[i]);
        }
    }
}


    
class cube_1{
    public static void main(String[] args) {
        cube c=new cube();
        c.cal();
        c.display();
    }
}
