import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String signal;
        signal=scan.next();
        int count=0;
        
        for(int i=0;i<signal.length();i++){
            if(i%3==1){
                if(signal.charAt(i)!='O'){count++;}
            }
            else if(i%3==0 || i%3==2){
                if(signal.charAt(i)!='S'){count++;}
            }
        }
        System.out.println(count);
    }
}
