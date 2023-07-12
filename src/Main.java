import java.util.Scanner;

class Reverse{
    public int[] reverseRange(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
     Reverse reverse=new Reverse();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter starting point");
        int start=scanner.nextInt();
        System.out.println("Enter ending point");
        int end=scanner.nextInt();
        System.out.println("After reverse:");
        reverse.reverseRange(arr,start,end);
        for(int i=0;i<sze;i++){
            System.out.print(arr[i]+" ");
        }

    }
}