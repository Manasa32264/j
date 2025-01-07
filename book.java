 import java.util.*;
 class book {
    Scanner sc=new Scanner(System.in);
    String name;
    int code,quantity;
    double unitPrice,totalPrice;

    void read(){
        System.out.println("ENter the name of the Book");
        name=sc.nextLine();
        System.out.println("Enter the code of the Book");
        code=sc.nextInt();
        System.out.println("Enter the number of Books");
        quantity=sc.nextInt();
        System.out.println("Enter the prive of the book");
        unitPrice=sc.nextInt();
        totalPrice=quantity*unitPrice;
    }

    void display(){
        System.out.println(name+"\t"+code+"\t"+quantity+"\t"+unitPrice+"\t"+totalPrice);
    }

    
}
class getBook{
    public static void main(String[] args) {
        System.out.println("Enter the number of books");
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        book[]b=new book[n];
        for(i=0;i<n;i++){
            b[i]=new book();
            System.out.println("Enter the details of book "+(i+1));
            b[i].read();
        }

        System.out.println("Name\t Code\tQuantity\tunitprice\tTotalprice\t ");
        for(i=0;i<n;i++){
            b[i].display();
        }
        
    }
}
