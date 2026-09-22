public class Count {
    public static void main(String[] args) {
        int n = -12345;
        int count = 0;
        do { 
            n=n/10;
            count++;    
        }while(n!=0);
        System.out.println(count); 
    }
}
// This program counts the number of digits in an integer.