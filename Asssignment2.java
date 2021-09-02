// create an array with five score out of 100 .compute the averavage of the score and compute percentage
class Test
{
    public static void main(String[]args)
    {
    int arr[]={10,20,30,40,50};//create array;
    int sum=0;
    int n= arr.length;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    int avg=sum/n;
    System.out.pritln("Aveage of array":avg);
    float percentage=sum/n;
    System.out.println(percentage);
    }

}

public class MatrixMultiplicationExample{  
public static void main(String args[]){     
int a[][]={{2,1,1},{3,2,4},{3,3,6}};    
int b[][]={{1,4,1},{2,7,2},{3,3,6}};       
int c[][]=new int[3][3];    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}
System.out.print(c[i][j]+" ");  
} 
System.out.println();   
}    
}}
//Sort the array in descending Order  
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;    /
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    
        
        Integer arr[]=new Integer[];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     
        {
            arr[i]=sc.nextInt();
        }
        
        int temp = 0;   
        
         for (int i = 0; i < arr.length; i++)  
         {     
            for (int j = i+1; j < arr.length; j++)    
            {     
               if(arr[i] < arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
              
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }    
    }
}