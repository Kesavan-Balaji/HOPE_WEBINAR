import java.util.*;
public class CanFormPalindromeUsingXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            flag^=(1<<ch-'a');
        }
        System.out.print(flag==0||(flag&(flag-1))==0?"YES":"NO");
        sc.close();
    }
}
