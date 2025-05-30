public class smallestElement {
    static int arr[] = {18,34,77,8};

    static int smallest(){
        int min = arr[0];
        int i = 1;
        for(i = 1;i< arr.length;i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
    public static void main (String[] args){
        System.out.println(smallest());
    }
}
