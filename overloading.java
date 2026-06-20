class Main{
    void add(int a,int b){
        System.out.println("The sum is:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("The sum is:"+(a+b+c));
        }
    void add(float a,float b){
        System.out.println("The sum is:"+(a+b));
    }
public static void main(String[] args){
    Main d=new Main();
    d.add(10,20);
    d.add(10,20,30);
    d.add(4.5f,6.5f);
}
}
