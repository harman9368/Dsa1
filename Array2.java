import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {
        //ArrayList<Integer> i = new ArrayList<>();
        //i.add(10);
        //i.add(20);
        //i.add(30);
        //i.add(40);
        //i.add(1,789);
        //i.remove(0);
        //System.out.println(i);
        int arr[] = {10, 20, 30, 40, 50};
        int index = 1;
        int i = 0;//arr.length-1 because of shifting i=i+1
        for ( i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i]=0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }

    }
}
