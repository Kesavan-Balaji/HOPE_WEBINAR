import java.util.*;

public class ABAB{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            if((n&1)==1 && s.charAt(0)=='b'){
                System.out.println("No");
                continue;
            }
            int i=((n&1)==1)?1:0;
            int flag=0;
            for(;i<n;i+=2){
                if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)!='?'){
                    System.out.println("No");
                    flag=1;
                    continue;
                }
            }
            if(flag==0)
            System.out.println("Yes");
        }
        sc.close();
    }
}