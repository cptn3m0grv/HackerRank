import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int j=0;
        while(j<t){
        String str=scan.next();
        String revs="";
        int count=0;

        for(int i = str.length() - 1; i >= 0; i--)
        {  revs = revs + str.charAt(i);}
         
        int strlen = str.length();
        int revslen = revs.length();

        int[] strarr = new int[strlen];
        int[] revsarr = new int[revslen];
        int[] diff_str_arr = new int[strlen-1];
        int[] diff_revs_arr = new int[revslen-1];

        for(int i=0;i<strlen && i<revslen;i++){
            strarr[i] = (int)str.charAt(i);
            revsarr[i] = (int)revs.charAt(i);
        }

        for(int i=0;i<(strlen-1);i++){
            diff_str_arr[i]=Math.abs((strarr[i]-strarr[i+1]));
        }
        for(int i=0;i<(revslen-1);i++){
            diff_revs_arr[i]=Math.abs((revsarr[i]-revsarr[i+1]));
        }
        for(int i=0;i<(strlen-1);i++){
            if(diff_str_arr[i]==diff_revs_arr[i]){count++;}
        }

        if(count==(strlen-1)){System.out.println("Funny");}
        else{System.out.println("Not Funny");}
        j++;
    }
        scan.close();
    }
}
