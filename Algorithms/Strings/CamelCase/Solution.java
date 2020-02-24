import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();

        int count=1;
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
