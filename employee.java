import java.util.*;
 class employee {
    Scanner sc=new Scanner(System.in);
    String ID;
    String name;
    String Department;
    double basicpay;
    double grosspay;
    double netpay;
    double TotalTax;

    void details(){
        System.out.println("Enter the ID of an employee");
        ID=sc.nextLine();
        System.out.println("Enter the name of an employee");
        name=sc.nextLine();
        System.out.println("Enter the depaetment");
        Department=sc.nextLine();
        System.out.println("Enter the Basic pay");
        basicpay=sc.nextDouble();
        grosspay=computeG();
        netpay=computeN();


    }
    double computeG(){
        double DA=(0.58*basicpay);
        double HRA=(0.16*basicpay);
        return (basicpay+DA+HRA);
    }

    double computeN(){
        if(grosspay<=200000){
            TotalTax=0;
        }
        else if(grosspay<=300000){
            TotalTax=0.10*grosspay;
        }else if(grosspay<=500000){
            TotalTax=0.15*grosspay;

        }else{
            double tax=0.30*grosspay;
            TotalTax=(0.2*tax+tax);
        }
        return(grosspay-TotalTax);
    }

    void display(){
        System.out.println(name+"\t\t"+ID+"\t\t"+Department+"\t\t"+basicpay+"\t\t"+TotalTax+"\t\t"+netpay);
    }


    
}

 class employee_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of Employees");
        n=sc.nextInt();
        employee[]e=new employee[n];
        for(i=0;i<n;i++){
            e[i]=new employee();
            System.out.println("Enter the detials of employee"+(i+1));
            e[i].details();
        }

        System.out.println("Name\t\t ID\t\tDepartment\t\tBasicPay\tTotalTax\t\tNetpay");
        for(i=0;i<n;i++){
            e[i].display();
        }


    }
}
