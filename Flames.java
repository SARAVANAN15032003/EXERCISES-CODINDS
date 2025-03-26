import java.util.*;
public class Flames {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        StringBuilder sb=new StringBuilder(s2);
        int co=0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(sb.toString().contains(c+"")){
                sb.deleteCharAt(sb.indexOf(c+""));
            }
            else
                co++;
        }
        co+=sb.length();

        int i=0,r=1;
        sb=new StringBuilder("FLAMES");
        while(sb.length()>1){
            if (r == co){
                sb.deleteCharAt(i);
                i--;
                r=0;
            }
            i++;
            r++;
            if(i>=sb.length()){
                i=0;
            }
        }
        switch (sb.charAt(0)){
            case 'F':
                System.out.println("FRIENDS");
                break;
            case 'L':
                System.out.println("LOVER");
                break;
            case 'A':
                System.out.println("AFFECTION");
                break;
            case 'M':
                System.out.println("MARRIAGE");
                break;
            case 'E':
                System.out.println("ENEMY");
                break;
            case 'S':
                System.out.println("SISTER");
                break;
        }

    }
}
