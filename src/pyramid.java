public class pyramid {
    public static void main(String[] args){
        int i =0;
        int row = 5;
        for(i=0;i<row;i++){
            int j = 0;
            for(j=row-i-1;j>=1;j--)
                System.out.print(" ");
            for(j=0;j<=i;j++)
                System.out.print("*");
            System.out.println(" ");
        }

    }
}
