 import java.util.*;
 class tempp {
  
    void input(double [][]arr){
       
        System.out.println("Enter the  max temperature (in degree c) during the first 6 days of the january~");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("In City-"+(i+1)+":");
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        
    }

    void HAL(double [][]arr){
       
        double high=arr[0][0];
        double low=arr[0][0];
        
        for( int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(high<arr[i][j]){
                    high=arr[i][j];
                    
                }
                if(low>arr[i][j]){
                    low=arr[i][j];
                    
                }

                
            }

        }
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(high==arr[i][j]){
                    System.out.println("Highedst temperature was"+high+" on the day"+(j+1)+"in the city"+(i+1));
                }
                if(low==arr[i][j]){
                    System.out.println("Lowest temperature was"+low+" on the day"+(j+1)+"in the city"+(i+1));
                }
                
            }
                    
        }
        
    }
    public static void main(String[] args) {
        tempp t=new tempp();
        double [][]arr=new double[5][6];
        t.input(arr);
        t.HAL(arr);

    }

    
  
    
}
