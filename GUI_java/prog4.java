import java.util.Scanner;

public class prog4 {
    void merge(int []arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int  n2=r-m;
        int []arr1= new int[n1];
        int []arr2= new int[n2];
        for (int i=0;i<n1;i++)
            arr1[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            arr2[j]=arr[m+j+1];

        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    void sort(int []arr, int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
    void display(int []arr,int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
    }

    void go() {
        prog4 m= new prog4();
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter how  many  elements");
        int n=sc.nextInt();
        System.out.print("Enter "+n+" elements\n");
        int []a= new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        m.sort(a,0,n-1);
        System.out.print("Sorted list: ");
        m.display(a,n);
    }
}
