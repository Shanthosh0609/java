import java.util.Scanner;
class main{
    String s;
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        main m= new main();
        System.out.println("Enter word:");
        m.s = sc.next();
        String rev ="";
        for(int i=m.s.length()-1;i>=0;i--){
            rev=rev+m.s.charAt(i);
        }
        if(m.s.equals(rev)){
            System.out.println("pali");}
        else{
            System.out.println("not pali");}
    }
}
