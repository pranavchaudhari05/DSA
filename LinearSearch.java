import java.util.Scanner;

public class LinearSearch{
    public static int Linear(int[] num, int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter Key value ");
        int key = sc.nextInt();
        int index = Linear(num , key);
        
        if(index == -1){
            System.out.println("element is not found !!");
        }
        else System.out.println("element is found at the index of " + index);
    }
}