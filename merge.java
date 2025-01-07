import java.util.*;
public class merge {
public static void main(String[] args) {
    

    Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array1");
    int size1=sc.nextInt();
    int arr1[]=new int [size1];

    System.out.println("Enter the array 1 e;ements");
    for(int i=0;i<size1;i++){
      arr1[i]=sc.nextInt();
    }
    System.out.println("Enter the size of array2");

int size2=sc.nextInt();
int arr2[]=new int [size2];
System.out.println("Enter the array 2 e;ements");
for(int i=0;i<size2;i++){
    arr2[i]=sc.nextInt();
}

int mergedarray[]=new int[size1+size2];
int k=0;
for(int i=0;i<size1;i++){
    mergedarray[k]=arr1[i];
    k++;

}

for(int i=0;i<size2;i++){
    mergedarray[k]=arr2[i];
    k++;

}

Arrays.sort(mergedarray);
System.out.println("print the merged array");
for(int i=0;i<mergedarray.length;i++){
    System.out.println(mergedarray[i]);
}
}





    
}
