import java.util.*;

class Circle {

    public static int getMaxNumber(int[] input){
        int max= input[0];
        for(int number: input){
            if(number > max){
                max = number;
            }
        }
        return max;
    }
    public static int getMinNumber(int[] input){
        int min = input[0];
        for(int number: input){
            if(number < min){
                min = number;
            }
        }
        return min;
    }
    public static int getSum(int[] input){
        int sum = 0;
        for(int number: input){
            sum += number;
        }
        return sum;
    }
    public static int getProduct(int[] input){
        int product = 1;
        for(int number: input){
            product *= number;

        }
        return product;
    }


    public static void main(String[] args) {

        Set<Book> hashSet = new HashSet<>();
//        hashSet.add("green");
//        hashSet.add("pink");
//        hashSet.add("pink");

        Book book1 = new Book("java","john", 1500);
        Book book2 = new Book("python","david", 1200);
        Book book3 = new Book("java","john", 1500);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        boolean add1 = hashSet.add(book1);
        boolean add2 = hashSet.add(book2);
        boolean add3 = hashSet.add(book3);
        System.out.println(add1 + "" + add2 +add3);
        System.out.println(hashSet);


    }




}


