public class count {
    public static void main(String[] args) {
        int n=12345;
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
            System.out.print(c);
    }
}
