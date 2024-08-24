import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    String ss="",sss="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(Character.isLetter(c))
      ss=c+ss;
    }
    int u=0;
    for(int j=0;j<s.length();j++){
      char r=s.charAt(j);
      if(Character.isLetter(r)){
        r=ss.charAt(u);
      u++;}
      sss=sss+r;}
      System.out.print(sss);
  }
}
