
class Cars {
    
    private String name;
    private float milage;
    private String color;
    int age;
    public void setData(String name,float milage,String color){
        this.name=name;
        this.milage=milage;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public float getMilage(){
        return milage;
    }
    public String getColor(){
        return color;
    }
}
public class Gettersetter {
    public static void main(String[] args) {
        Cars c=new Cars();
        c.setData("BMW",25.8f,"blue");
        System.out.println("The car name:"+c.getName());
        System.out.println("The car milage:"+c.getMilage());
        System.out.println("The car color :"+c.getColor());
         Cars c1=new Cars();
        c1.setData("Swift",20.8f,"Black");
        System.out.println("The car name:"+c1.getName());
        System.out.println("The car milage:"+c1.getMilage());
        System.out.println("The car color :"+c1.getColor());
    }
}
