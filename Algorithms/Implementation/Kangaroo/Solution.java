import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int v1=scan.nextInt();
        int d1=x1+v1;
        int x2=scan.nextInt();
        int v2=scan.nextInt();
        int d2=x2+v2;
        int c=0;
        for(int i=0;i<1000000;i++){
            if(d1==d2){
               c=1;
               break;
            }
            d1=d1+v1;
            d2=d2+v2;
        }

        if(c==1){System.out.println("YES");}
        else if(c==0){System.out.println("NO");}


    }
}
