public class simpleInterest {
    public static int simple(int P,int T,int R){
        int I = (P*T*R)/100;
        return I;
    }
    public static void main (String[]args){
        System.out.println("SI ="  + simple(1000,5,5));
    }
}
