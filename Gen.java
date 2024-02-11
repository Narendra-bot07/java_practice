class GenWithGenMethod{
    public <T,V> void genericsMethod(T data,V data2){
        System.out.println("Generics medhod");
        System.out.println("T type: "+data+ " is a "+data.getClass()+"\nV type "+ data2 +" "+data2.getClass()  );
    }
}


/*Generic class and Return type using Generic variables */
class Gen<T extends String,V extends Number,E extends Number>{
    private T t;
    private V i;
    private E a;
     Gen(T t,V i,E a){
        this.setT(t);
        this.setV(i);
        this.setE(a);
     }
     public void setT(T t){
        this.t=t;
     }
     public void setV(V i){
        this.i=i;
     }
     public void setE(E a)
     {
        this.a=a;
     }
     public T getT(){
        return this.t;
     }
     public V getV(){
        return this.i;
     }
     public E getE(){
        return this.a;
     }
     public static void main(String[] args){
        Gen<String,Integer,Double> g = new Gen<>("Narendra",90,9.2);
       System.out.println(g.getT()+" "+g.getV()+" "+g.getE());
       GenWithGenMethod g2 = new GenWithGenMethod();
       g2.<String,Integer>genericsMethod("Hello",99);
     }
    }
