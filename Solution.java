
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();  //To enter values in array
    }
    
    //Checking the -ve element.
        int c=0;
    for(int i=0;i<n;i++){  //Outter loop only for interation
        int s=0;
    for(int j=i;j<n;j++){  // Inner loop to iterate the elements that are inside the array
            s=s+arr[j];
            if(s<0){
                c+=1;
            }
        }
        
    }
     System.out.print(c);
    
    }
}
