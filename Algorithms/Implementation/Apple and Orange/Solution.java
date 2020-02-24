import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int t=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[] apples=new int[m];
        int[] oranges=new int[n];
        int ca=0;
        int co=0;
        for(int i=0;i<m;i++){
            apples[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            oranges[i]=scan.nextInt();
        }

        for(int i=0;i<m;i++){
            apples[i]=a+apples[i];
            if(apples[i]>=s && apples[i]<=t){ca++;}
        }
        for(int i=0;i<n;i++){
            oranges[i]=b+oranges[i];
            if(oranges[i]>=s && oranges[i]<=t){co++;}
        }
        System.out.println(ca+"\n"+co);


    }
}
