public class Main {
    public static void main(String[] args) {
    int arr[]={3,2,8,1,4,7};
    int n= arr.length;

    CountingEven(arr,n);
    }
static void CountingEven(int arr[], int arr_size){
        int even_count=0;
        int odd_count=0;
        for (int i=0; i< arr_size;i++){
            if ((arr[i] & 1)== 1)
                odd_count++;

            else
                even_count++;
            }
            System.out.println("number of even elements= "+even_count);

        }
}


