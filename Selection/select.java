package Selection;
import java.util.*;

class select
{
    public static void exchange(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void sortedarray(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    exchange(arr,i,j);
                }
            }
        }
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("input elements in array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sortedarray(arr,n);
        System.out.print("Sorted array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        sc.close();
    }
}