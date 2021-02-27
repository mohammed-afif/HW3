public class GeArry{
    public static<T> void print(T arr[]){
        for (int i=0; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
public static<T> void reverse(T arr[]){
      int  n=arr.length-1;
    for (int i = 0; i < arr.length / 2; i++) {
        T temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        n--;
    }
}
    public static void main(String[] args) {
        Integer x[]={1,2,3,4,5};
        reverse(x);
        print(x);
    }
}
