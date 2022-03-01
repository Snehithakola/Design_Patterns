import java.util.ArrayList;
import java.util.List;

class Model implements Cloneable{
    private List<String> modelList;
    public Model(){
        this.modelList=new ArrayList<String>();
    }
    public Model(List<String> list)
    {
        this.modelList=list;
    }
    public void insertData()
    {
        modelList.add("Lamborghini");
        modelList.add("Mercedes benz");
        modelList.add("Audi");
        modelList.add("BMW");
        modelList.add("Renold duster");
    }
    public List<String> getModelList()
    {
        return this.modelList;
    }
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<String>();
        for(String s:this.getModelList())
        {
            tempList.add(s);
        }
        return new Model(tempList);
    }

}
public class Prototype {
    public static void main(String args[]) throws CloneNotSupportedException {
        Model a = new Model();
        a.insertData();
        Model b = (Model) a.clone();
        List<String> list = b.getModelList();
        list.add("suzuki");
        System.out.println(a.getModelList());
        System.out.println(list);
        b.getModelList().remove("Audi");
        System.out.println(list);
    }
}