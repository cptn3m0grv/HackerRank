import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i++){array[i]=scan.nextInt();}

        int day = scan.nextInt();
        int month = scan.nextInt();

        int sum=0;
        int count =0;

        if(month<=array.length){
            for(int i=0;i<month;i++){
               sum=sum+array[i];
            }
            if(sum == day){count++;}
        }

        for(int i = 0; i < array.length-month; i++)
        {
            sum = sum - array[i] + array[i+month];
            if(sum == day) count++;
        }
        System.out.println(count);
        scan.close();
    }
}
