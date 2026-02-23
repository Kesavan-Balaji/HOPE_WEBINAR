import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            flag|=(1<<(ch-'a'));
        }
        System.out.print(flag==(1<<26)-1?"YES":"NO");
        sc.close();
    }
}
