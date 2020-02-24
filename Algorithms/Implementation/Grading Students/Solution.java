import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] grades=new int[n];

        for(int i=0;i<n;i++){
            grades[i]=scan.nextInt();
        }

        for(int i=0;i<n;i++){
            if(grades[i]<38){
                System.out.println(grades[i]);
            }
            else{
                if(((grades[i]+(5-(grades[i]%5)))-grades[i])>=3){
                    System.out.println(grades[i]);
                }
                else{
                System.out.println((grades[i]+(5-(grades[i]%5))));
                }
            }
        }
    }
}
