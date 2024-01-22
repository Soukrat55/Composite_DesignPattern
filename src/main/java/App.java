public class App {
    public static void main(String[] args){
        Folder root=new Folder("Root");
        Folder f1=new Folder("Structure");
        Folder f2=new Folder("Component");
        Folder f3=new Folder("Création");
        root.addComponent(f1);
        root.addComponent(f2);
        root.addComponent(f3);
        f1.addComponent(new File("Composite"));//
        f1.addComponent(new File("Strategy"));//les deux f1(Strategy,Composite) compose dans f1 original
        f2.addComponent(new File("Singleton"));
        f3.addComponent(new File("Builder"));
        f3.addComponent(new File("Decorator"));

        Folder ff1=(Folder) f1.addComponent(new Folder("St1"));
        ff1.addComponent(new File("composite version 2"));

        root.view();


    }
}
