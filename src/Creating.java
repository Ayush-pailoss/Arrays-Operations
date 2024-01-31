import java.util.Scanner;

public class Creating {
   static int count =0;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int[5];
        for (int i = 0; i <array.length ; i++) {
            Creating.insert(array,i+1);
        }
        Creating.insertAt(array,26);
        Creating.insertAt(array,103);
        Creating.insertAtPosition(array,3,33);
        Creating.print(array);

//        for(int j : array){
//            System.out.print(j+" ");
//        }

    }
    public static void insertAtPosition(int[]a, int position,int val){
        for (int i =count-1; i>position ; i--) {
        a[i]=a[i-1];
        }
        a[position]=val;
    }
    public static void insert(int[] index, int val){
        index[count++]=val;
    }
    public static void print(int [] a){
        for (int j = 0; j < a.length ; j++) {
            System.out.print(a[j] + " ");
        }
    }
    public static void insertAt(int ar [], int val){
        for (int i =count-1;i>0;i-- ) // in place count we can write ar.length
        {
            ar[i]=ar[i-1];
        }
        ar[0]=val;
    }
}
