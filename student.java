import java.util.*;
class student {
    Scanner sc=new Scanner(System.in);
    String name,usn;
        double s1,s2,s3;
     double total;

    void read(){
        
        //int rollNo;
        System.out.println("Enter the name of the Student");
        name=sc.nextLine();
        System.out.println("Enter the usn");
        usn=sc.next();
        System.out.println("Enter subject-1 marks");
        s1=sc.nextInt();
        System.out.println("Enter subject-2 marks");
        s2=sc.nextInt();
        System.out.println("Enter subject-3 marks");
        s3=sc.nextInt();


    }

    void result(){
       // double total;
        total=s1+s2+s3;
       // System.out.println(total);

    }

    void display(){
        System.out.println(usn+"\t"+s1+"\t"+s2+"\t"+s3+"\t"+total+"\t");

    }
}
 class student_1{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        double hs1,hs2,hs3,t;
        System.out.println("\nEnter the number of students: ");
        n=sc.nextInt();
        student[]s=new student[n];
        for( i=0;i<n;i++){
            s[i]=new student();
            System.out.println("\n Enter the details of the student-"+(i+1)+" : ");
            s[i].read();
            s[i].result();

            
        }
        hs1=s[0].s1;
        hs2=s[0].s2;
        hs3=s[0].s3;
        t=s[0].total;

        for( i=1;i<s.length;i++){
            if(hs1<s[i].s1){
                hs1=s[i].s1;
            }
            if(hs2<s[i].s2){
                hs2=s[i].s2;
            }
            if(hs3<s[i].s3){
                hs3=s[i].s3;
            }
            if(t<s[i].total){
                t=s[i].total;
            }
        }

        System.out.println("USN\tsub-1\tsub-2\tsub-3\ttotal\t");
        for(i=0;i<s.length;i++){
            s[i].display();
        }

        for(i=0;i<s.length;i++){
            if(hs1==s[i].s1){
                System.out.println("\n Subject-1 topper's USN is-"+s[i].usn+"and has secuered "+hs1+"marks");
            }
            if(hs2==s[i].s2){
                System.out.println("\n Subject-1 topper's USN is-"+s[i].usn+"and has secuered "+hs2+"marks");
            }
            if(hs3==s[i].s3){
                System.out.println("\n Subject-1 topper's USN is-"+s[i].usn+"and has secuered "+hs3+"marks");
            }
            if(t==s[i].total){
                System.out.println("\n batch topper,s USN is-"+s[i].usn+"and has secuered "+t+"marks");
            }
        }



    }

    
    
}
