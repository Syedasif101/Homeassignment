import java.util.Scanner;  
class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);    
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        x = x + y;   
        y = x - y;   
        x = x - y; 
        
          System.out.println("swap "+x +"  " + y);   
    }   
}  