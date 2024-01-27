import java.util.Scanner;

public class Creating {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int [] a= new int[5];
        try{
        for (int i = 0; i <a.length ; i++) {
            System.out.println("enter number  :");
            a[i] = scanner.nextInt();

        }
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("index out of bound : ");
        }
        for (int j=0;j<=a.length;j++){
            System.out.println(a[j]);
        }
    }
}
