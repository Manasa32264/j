import java.util.Scanner;

class election {
    int spoiltballot=0;
    void counting(int []count){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("[Enter -1 to EXIT]");
            System.out.println("Enter the candidate numbr on the ballot paper");
            int  vote=sc.nextInt();
            if(vote>=1&&vote<=5){
                System.out.println("ENterted the valid ballot");
                switch (vote) {
                    case 1:count[0]++;
                    break;
                        
                       case 2:count[1]++;
                       break;

                       case 3:count[2]++;
                       break;

                       case 4:count[3]++;
                       break;

                       case 5:count[4]++;
                       break;

                       
                   
                }
            }else if(vote==-1){
                break;


            }else{
                System.out.println("Entered spolit baallot ");
                spoiltballot++;
            }
        }
    }

    void display(int count[]){
             System.out.println("ELECTION RESULts");
             for(int i=0;i<5;i++){
                System.out.println("candidtate "+(i+1)+" got "+count[i]+" votes ");
             }
             System.out.println("The number of spoilt ballot ares "+spoiltballot);
    }




    
}

class election_2{
    public static void main(String[] args) {
        int count[]=new int[5];
        election e=new election();
        e.counting(count);
        e.display(count);
    }
}
