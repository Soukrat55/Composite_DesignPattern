import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    private List<Component> components =new ArrayList<>();
    public Folder(String name){
        super(name);
    }
    @Override
    public void view(){
        String tab=indentation();
        System.out.println(tab+"Folder : "+name);
        for (Component c:components){
          c.view();
        }
   }
    public Component addComponent(Component component){
        component.level=this.level+1;
        component.parent=this;
        this.components.add(component);
        return component;
    }
    public Component getComponent(String string){
        for(Component c:components){
            if(c.name.equals(name)) return c;
        }
        return null;
    }
}
