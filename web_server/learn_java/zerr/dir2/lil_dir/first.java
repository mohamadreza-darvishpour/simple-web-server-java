
package dir2.lil_dir; 
import dir1.fil_dir.another ; 


class g_class{
    public void show_any(){
        System.out.println("show from g_class method show_any");
    }
}



public class  first{

    public static void main(String[] args){

        System.out.print("print in main from first . \n"); 
        another new_show = new another() ; 
        new_show.first_pack_show(); 
        }
}